package com.PracticalTraining.N7;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

import static com.PracticalTraining.N7.DataSave.ONLINE_CLIENT_MAP;

public class HandlerClient1 implements Runnable {
    private final Socket clientSocket;

    public HandlerClient1(Socket client) {
        this.clientSocket = client;
        ONLINE_CLIENT_MAP.put(this.clientSocket.hashCode(), this.clientSocket);
    }

    @Override
    public void run() {
        try {
            InputStream clientInput = clientSocket.getInputStream();
            Scanner scanner = new Scanner(clientInput);

            while (true) {
                String data = scanner.nextLine();
                System.out.println("来自客户端消息: " + clientSocket.hashCode() + " " + data);
            }
        } catch (IOException e) {
            e.printStackTrace();
            ONLINE_CLIENT_MAP.remove(clientSocket.hashCode());
        }
    }
}
