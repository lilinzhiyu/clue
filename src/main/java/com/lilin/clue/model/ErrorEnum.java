package com.lilin.clue.model;

/**
 * Created by xiaopang on 2018/5/10.
 */
public enum ErrorEnum {
    SERVICE_OK("Service is ok"),
    User_Error("User Account Message Error");

    private String errorMessage;

    private ErrorEnum(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
