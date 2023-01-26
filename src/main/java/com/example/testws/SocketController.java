package com.example.testws;




import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import javax.websocket.server.ServerEndpointConfig;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@ServerEndpoint(value = "/test",configurator = Configurator.class)
public class SocketController {

    private static final Set<Session> sessions = Collections.synchronizedSet(new HashSet<>());

    @OnOpen
    public void onOpen(EndpointConfig config, Session userSession) {
        System.out.println("opening websocket");
        sessions.add(userSession);
    }

    @OnMessage
    public void handleMessage(String message) {
        sessions.forEach(x-> {
            try {
                x.getBasicRemote().sendText(message);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    @OnClose
    public void onClose(Session userSession, CloseReason reason) {
        System.out.println("closing websocket");

    }
}
