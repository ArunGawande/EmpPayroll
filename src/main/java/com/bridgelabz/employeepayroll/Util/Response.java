package com.bridgelabz.employeepayroll.Util;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Response {

    private String message;
    private int errorCode;
    private Object token;

    public Response() {

    }
}
