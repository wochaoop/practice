package com.PracticalTraining.N7;

import java.net.Socket;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class DataSave {
    // Maintain all client objects connected to the server
    public static final ConcurrentHashMap<Integer, Socket> ONLINE_CLIENT_MAP = new ConcurrentHashMap<>();

    // Other code goes here
}
