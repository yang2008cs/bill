package com.bill.exception;

/**
 * @author LiuYang
 * @version 1.0
 * @package: com.bill.exception
 * @description: TODO
 * @date 2018-06-26 18:59
 */
public class MyException extends RuntimeException {
    private String message;

    public MyException(String message){
        super(message);
        this.message=message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
