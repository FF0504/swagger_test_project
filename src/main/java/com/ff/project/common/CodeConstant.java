package com.ff.project.common;

public enum CodeConstant {


    SYSTEM_ERROR(4444, "服务器繁忙，请稍后再试"),

    PARAM_ERROR(1001, "请求参数缺少"),
    SUCCESS(0, "success");

    private Integer code;

    private String msg;

    CodeConstant(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer code() {
        return code;
    }

    public String msg() {
        return msg;
    }

}
