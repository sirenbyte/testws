package com.example.testws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Timer;

@SpringBootApplication
public class TestwsApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(TestwsApplication.class, args);
        Test.read();
        SocketController socketController = new SocketController();

        MyTimerTask timerTask = new MyTimerTask(socketController);
        Timer t = new Timer();
        t.scheduleAtFixedRate(timerTask, 0, 10000);
    }

}
