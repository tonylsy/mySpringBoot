package com.myspringboot.Common;

/*
 * this class is used to contain all Result on the project
 */
public class Result {
    private boolean status;
    private String message;
    private Object data;

    public Result(boolean status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static Result OK() {
        return new Result(true, null, null);
    }

    public static Result OK(String message, Object data) {
        return new Result(true, message, data);
    }

    public static Result Fail() {
        return new Result(false, null, null);
    }

    public static Result Fail(String message, Object data) {
        return new Result(false, message, data);
    }
}
