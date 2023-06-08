package com.PracticalTraining.N7;

import java.io.IOException;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) {
        // Read the server address
        String host = "127.0.0.1";

        // Read the port number
        int port = 6666;

        try {
            Socket connToServerSocket = new Socket(host, port);

            // Create and start the read thread
            new ReadDataFromServerThread(connToServerSocket).start();

            // Create and start the write thread
            new WriteDataToServerThread(connToServerSocket).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
