package com.example.testws;



import java.util.TimerTask;

public class MyTimerTask extends TimerTask {

    private SocketController socketController;

    public MyTimerTask(SocketController websocketClientEndpoint) {
        this.socketController = websocketClientEndpoint;
    }

    @Override
    public void run() {
        socketController.handleMessage("{\"obratniyPotok\":\"000000000\",\"rssi\":\"-123\",\"freq\":\"865.7\",\"statusAlarm\":\"6E\",\"statusShetchika\":\"00\",\"devEui\":\"8CC30232011E4795\",\"codeCmd\":\"02\",\"voltageLevel\":\"0100\",\"snr\":\"00\",\"potreblenie\":\"84BE00000\",\"nomerShetchika\":\"04000008\",\"id\":65,\"signal\":\"00\",\"gatewayId\":\"0000B827EB58A37C\"}");
    }
}
