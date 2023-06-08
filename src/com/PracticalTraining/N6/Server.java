package com.PracticalTraining.N6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        int port = 8080;
        int backlog = 50; // 最大排队等待连接的客户端数

        try {
            // 创建ServerSocket对象，并设置队列长度
            ServerSocket serverSocket = new ServerSocket(port, backlog);
            System.out.println("服务器已启动，等待客户端连接...");

            while (true) {
                // 等待客户端连接
                Socket clientSocket = serverSocket.accept();
                System.out.println("客户端连接成功，处理客户端请求...");

                // 获取输入流和输出流
                BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter writer = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()), true);

                // 处理客户端消息并输出
                Thread inputThread = new Thread(() -> {
                    try {
                        String clientMessage;
                        while ((clientMessage = reader.readLine()) != null) {
                            System.out.println("客户端消息: " + clientMessage);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            clientSocket.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });
                inputThread.start();

                // 持续监听客户端的输入
                BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));
                String userInput;
                while ((userInput = userInputReader.readLine()) != null) {
                    // 向客户端发送用户输入的消息
                    writer.println(userInput);
                    System.out.println("已发送消息给客户端: " + userInput);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
