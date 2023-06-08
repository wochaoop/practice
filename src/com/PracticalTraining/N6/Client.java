package com.PracticalTraining.N6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        String serverAddress = "localhost";
        int serverPort = 8080;

        try {
            // 连接服务器
            Socket socket = new Socket(serverAddress, serverPort);
            System.out.println("成功连接到服务器...");

            // 获取输入流和输出流
            BufferedReader serverReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter serverWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);

            // 创建一个线程用于接收服务器消息并输出
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

            // 获取用户输入并发送给服务器
            BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));
            String userInput;
            while ((userInput = userInputReader.readLine()) != null) {
                serverWriter.println(userInput);
                System.out.println("已发送消息给服务器: " + userInput);
            }

            // 关闭连接
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
