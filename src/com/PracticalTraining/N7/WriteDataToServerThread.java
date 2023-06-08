package com.PracticalTraining.N7;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class WriteDataToServerThread extends Thread {
    private final Socket connToServerSocket;

    public WriteDataToServerThread(Socket _connToServerSocket) {
        this.connToServerSocket = _connToServerSocket;
    }

    @Override
    public void run() {
        try {
            OutputStream clientOutput = this.connToServerSocket.getOutputStream();
            OutputStreamWriter writer = new OutputStreamWriter(clientOutput);
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("请输入 >> ");
                String data = scanner.nextLine(); // Read data from user input
                writer.write(data + "\n"); // Write data to the server
                writer.flush(); // Flush the writer

                if (data.equals("bye")) {
                    System.out.println("您已下线...");
                    break;
                }
            }

            this.connToServerSocket.close();
        } catch (IOException e) {
            // Handle IO exception
            // e.printStackTrace();
        }
    }
}
