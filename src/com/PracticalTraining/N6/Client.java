package com.PracticalTraining.N6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    private static final String DEFAULT_SERVER_ADDRESS = "localhost";
    private static final int DEFAULT_SERVER_PORT = 8080;
    private static String serverAddress;
    private static int serverPort;

    public static void main(String[] args) {
        if (args.length > 0) {
            String[] addressParts = args[0].split(":");
            if (addressParts.length == 2) {
                serverAddress = addressParts[0];
                serverPort = Integer.parseInt(addressParts[1]);
            } else {
                System.out.println("请提供正确的服务器地址和端口号，格式为 address:port");
                return;
            }
        } else {
            serverAddress = DEFAULT_SERVER_ADDRESS;
            serverPort = DEFAULT_SERVER_PORT;
        }

        while (true) {
            try {
                connectToServer();
                break;
            } catch (IOException e) {
                System.out.println("无法连接到服务器，尝试重新连接...");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    private static void connectToServer() throws IOException {
        Socket socket = new Socket(serverAddress, serverPort);
        if (socket.isConnected()) {
            System.out.println("成功连接到服务器...");
        }

        BufferedReader serverReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter serverWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);

        Thread serverThread = new Thread(() -> {
            try {
                String serverMessage;
                while ((serverMessage = serverReader.readLine()) != null) {
                    System.out.println("收到服务器消息: " + serverMessage);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        serverThread.start();

        BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));
        String userInput;
        while ((userInput = userInputReader.readLine()) != null) {
            serverWriter.println(userInput);
            System.out.println("已发送消息给服务器: " + userInput);
        }

        socket.close();
    }
}
