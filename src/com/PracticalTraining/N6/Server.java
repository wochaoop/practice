package com.PracticalTraining.N6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private static final int DEFAULT_PORT = 8080;
    private static final int BACKLOG = 50;
    private static int port;

    public static void main(String[] args) {
        if (args.length > 0) {
            port = Integer.parseInt(args[0]);
        } else {
            port = DEFAULT_PORT;
        }

        while (true) {
            try {
                startServer(port);
            } catch (IOException e) {
                System.out.println("服务器错误: " + e.getMessage());
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    private static void startServer(int port) throws IOException {
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(port, BACKLOG);
            System.out.println("服务器已启动，等待客户端连接...");

            while (true) {
                Socket clientSocket = null;

                try {
                    clientSocket = serverSocket.accept();
                    System.out.println("客户端连接成功，处理客户端请求...");

                    ClientHandler clientHandler = new ClientHandler(clientSocket);
                    Thread clientThread = new Thread(clientHandler);
                    clientThread.start();
                } catch (IOException e) {
                    e.printStackTrace();
                    if (clientSocket != null) {
                        clientSocket.close();
                    }
                }
            }
        } finally {
            if (serverSocket != null) {
                serverSocket.close();
            }
        }
    }

    static class ClientHandler implements Runnable {
        private Socket clientSocket;
        private BufferedReader reader;
        private PrintWriter writer;

        public ClientHandler(Socket clientSocket) {
            this.clientSocket = clientSocket;
        }

        @Override
        public void run() {
            try {
                reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                writer = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()), true);

                String clientMessage;
                while ((clientMessage = reader.readLine()) != null) {
                    System.out.println("客户端消息: " + clientMessage);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (reader != null) {
                        reader.close();
                    }
                    if (writer != null) {
                        writer.close();
                    }
                    clientSocket.close();
                    System.out.println("客户端断开连接");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
