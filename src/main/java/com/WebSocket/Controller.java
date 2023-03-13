package com.WebSocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.handler.annotation.Payload;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/application")
    @SendTo("/all/messages")
    public Message send(final Message message) throws Exception
    {
        return message;
    }

    @MessageMapping("/private")
    public void sentToUser(@Payload Message message)
    {
        simpMessagingTemplate.convertAndSendToUser(message.getTo(),"/specificuser",message);
    }
}
