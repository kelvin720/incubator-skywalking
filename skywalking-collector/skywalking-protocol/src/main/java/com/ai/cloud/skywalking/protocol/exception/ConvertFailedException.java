package com.ai.cloud.skywalking.protocol.exception;

import com.google.protobuf.InvalidProtocolBufferException;

public class ConvertFailedException extends Exception {


    public ConvertFailedException(String message, Exception e) {
        super(message, e);
    }
}
