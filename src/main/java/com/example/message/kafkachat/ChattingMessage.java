package com.example.message.kafkachat;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class ChattingMessage implements Serializable {
    private String message;
    private String user;
    private Long timeStamp;

    private String fileName;
    private String rawData;


    @Builder
    public ChattingMessage(String fileName, String rawData, String user) {
        this.fileName = fileName;
        this.rawData = rawData;
        this.user = user;
    }
}
