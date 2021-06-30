package com.mbcloud.sample.util;

public class ResultCode {

    private String code;

    private String msg;

    /**
     * 返回成功
     */
    public static final ResultCode SUCCESS = new ResultCode("0", "ok");

    public static final ResultCode INTERNAL_SERVER_ERROR = new ResultCode("500", "系统异常，请稍后再试");


    public ResultCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
