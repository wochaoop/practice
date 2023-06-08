package com.PracticalTraining.N7;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

public class ReadDataFromServerThread extends Thread {
    private final Socket connToServerSocket;

    public ReadDataFromServerThread(Socket _connToServerSocket) {
        this.connToServerSocket = _connToServerSocket;
    }

    @Override
    public void run() {
        try {
            InputStream clientInput = this.connToServerSocket.getInputStream();
            Scanner scanner = new Scanner(clientInput);

            while (true) {
                String data = scanner.nextLine(); // Read data line by line
                System.out.println("来自服务端消息: " + data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
