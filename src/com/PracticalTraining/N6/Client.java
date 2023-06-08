package com.PracticalTraining.N6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        String serverHost = "localhost";
        int serverPort = 8080;

        try {
            // 连接到服务器
            Socket socket = new Socket(serverHost, serverPort);
            System.out.println("成功连接到服务器...");

            // 获取输入流和输出流
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);

            // 不断获取用户输入，并发送给服务器
            BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));
            String userInput;
            while (true) {
                System.out.print("请输入消息 (输入 'exit' 退出): ");
                userInput = userInputReader.readLine();

                if (userInput.equalsIgnoreCase("exit")) {
                    break;
                }

                // 向服务器发送用户输入的消息
                writer.println(userInput);
                System.out.println("已发送消息给服务器: " + userInput);

                // 读取服务器的响应
                String response = reader.readLine();
                System.out.println("服务器的响应: " + response);
            }

            // 关闭资源
            writer.close();
            reader.close();
            userInputReader.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
