package com.example.demo;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface Channel {

    @Output("output")
    MessageChannel output();

    @Input("input")
    SubscribableChannel input();
}
