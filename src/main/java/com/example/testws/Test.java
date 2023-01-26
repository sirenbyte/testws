package com.example.testws;


import org.glassfish.tyrus.server.Server;

public class Test {
    public static void read() {
        Server server = new Server("localhost", 9090, "/echo",null, SocketController.class);
        try {
            server.start();
            System.out.println("--- server is running");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

