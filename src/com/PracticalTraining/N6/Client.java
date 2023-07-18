package com.PracticalTraining.N6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Client {
    private static final String DEFAULT_SERVER_ADDRESS = "localhost";
    private static final int DEFAULT_SERVER_PORT = 8080;
    private static String serverAddress;
    private static int serverPort;

    public static void main(String[] args) {
        parseArguments(args);
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

    private static void parseArguments(String[] args) {
        serverAddress = DEFAULT_SERVER_ADDRESS;
        serverPort = DEFAULT_SERVER_PORT;

        if (args.length > 0) {
            String arg = args[0].trim();
            if (!arg.isEmpty()) {
                try {
                    Pattern pattern = Pattern.compile("^(.*?):(\\d+)$");
                    Matcher matcher = pattern.matcher(arg);
                    if (matcher.matches()) {
                        serverAddress = matcher.group(1);
                        serverPort = Integer.parseInt(matcher.group(2));
                    } else {
                        System.out.println("无效的参数格式，使用默认值");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("无效的端口号参数，使用默认值");
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
