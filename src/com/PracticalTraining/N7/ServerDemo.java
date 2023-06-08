package com.PracticalTraining.N7;

import static com.PracticalTraining.N7.DataSave.ONLINE_CLIENT_MAP;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        int port = 6666;
        ServerSocket serverSocket;

        try {
            serverSocket = new ServerSocket(port);
            System.out.println("服务器启动...." + serverSocket.getLocalSocketAddress());

            while (true) {
                Socket client = serverSocket.accept();
                System.out.println("有客户端连接到服务器: " + client.getRemoteSocketAddress());
                executor.execute(new HandlerClient(client));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class HandlerClient implements Runnable {
    private final Socket clientSocket;

    public HandlerClient(Socket client) {
        this.clientSocket = client;
        ONLINE_CLIENT_MAP.put(this.clientSocket.hashCode(), this.clientSocket);
    }

    @Override
    public void run() {
        try {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("给所有客户端发送信息 >> ");
                String data = scanner.nextLine();

                for (Map.Entry<Integer, Socket> entry : ONLINE_CLIENT_MAP.entrySet()) {
                    Socket clientSocket = entry.getValue();
                    OutputStreamWriter writer = new OutputStreamWriter(clientSocket.getOutputStream());
                    writer.write(data + "\n");
                    writer.flush();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            ONLINE_CLIENT_MAP.remove(clientSocket.hashCode());
        }
    }
}
