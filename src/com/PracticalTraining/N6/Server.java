package com.PracticalTraining.N6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

            // 等待客户端连接并进行处理
            Socket clientSocket = serverSocket.accept();
            System.out.println("客户端已连接，开始通信...");

            // 获取输入流，用于接收客户端消息
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            // 循环接收并输出客户端的消息
            String message;
            while ((message = reader.readLine()) != null) {
                System.out.println("收到客户端消息: " + message);
            }

            // 关闭资源
            reader.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
