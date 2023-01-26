package com.example.testws;


import org.glassfish.tyrus.server.Server;

import java.util.Timer;

public class Test {
    public static void read() {
        Server server = new Server("localhost", 9090, "/echo",null, SocketController.class);
        try {
            server.start();
            System.out.println("--- server is running");
            SocketController socketController = new SocketController();

            MyTimerTask timerTask = new MyTimerTask(socketController);
            Timer t = new Timer();
            t.scheduleAtFixedRate(timerTask, 0, 10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

