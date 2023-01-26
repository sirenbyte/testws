package com.example.testws;



import java.util.TimerTask;

public class MyTimerTask extends TimerTask {

    private SocketController socketController;

    public MyTimerTask(SocketController websocketClientEndpoint) {
        this.socketController = websocketClientEndpoint;
    }

    @Override
    public void run() {
        socketController.handleMessage("{\n" +
                "    \"battery_level\": null, \n" +
                "    \"join_request_time\": \"2022-12-08T06:45:13.833290\", \n" +
                "    \"devAddr\": \"EF6CAABC\", \n" +
                "    \"data\": {\n" +
                "        \"adr\": true, \n" +
                "        \"fcnt\": 8384, \n" +
                "        \"ack\": false, \n" +
                "        \"fport\": 10, \n" +
                "        \"time\": \"2023-01-21T17:44:04.425181\", \n" +
                "        \"datr\": 0, \n" +
                "        \"mtype\": 2, \n" +
                "        \"fopts\": \"\", \n" +
                "        \"lsnr\": -14.0, \n" +
                "        \"gatewayId\": \"0000B827EB58A37C\", \n" +
                "        \"rssi\": -123, \n" +
                "        \"freq\": 865.7, \n" +
                "        \"data\": \"020400000884BE00000000000000006E01000000\", \n" +
                "        \"packet_loss_rate\": 98.99257688229056, \n" +
                "        \"size\": 33\n" +
                "    }, \n" +
                "    \"cmd\": \"realtime_data\", \n" +
                "    \"devEui\": \"8CC30232011E4795\", \n" +
                "    \"margin\": null\n" +
                "}\n");
    }
}
