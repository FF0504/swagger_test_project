package com.ff.project.vo;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ff.project.common.CodeConstant;
import lombok.Data;

/**
 * @Author: FF
 * @Date: 2019/7/2 11:05
 * @Version 1.0
 */
@Data
public class ResponseVO<T> {
    private Integer code;

    private String msg;

    private T data;

    @JsonIgnore
    private String errormsg;


    /**
     * 返回系统错误结果
     *
     * @return
     */
    public static <T> ResponseVO<T> failResponse() {
        ResponseVO<T> responseVO = new ResponseVO<>();
        responseVO.setCode(CodeConstant.SYSTEM_ERROR.code());
        responseVO.setMsg(CodeConstant.SYSTEM_ERROR.msg());
        return responseVO;
    }

    public static <T> ResponseVO<T> failResponse(String msg) {
        ResponseVO<T> responseVO = new ResponseVO<>();
        responseVO.setCode(CodeConstant.SYSTEM_ERROR.code());
        responseVO.setMsg(msg);
        return responseVO;
    }

    public static <T> ResponseVO<T> failResponse(Integer code, String msg) {
        ResponseVO<T> responseVO = new ResponseVO<>();
        responseVO.setCode(code);
        responseVO.setMsg(msg);
        return responseVO;
    }


    public static <T> ResponseVO<T> failResponse(CodeConstant errorConstant, String msg) {
        ResponseVO<T> responseVO = new ResponseVO<>();
        responseVO.setMsg(msg);
        responseVO.setCode(errorConstant.code());
        return responseVO;
    }

    public static <T> ResponseVO<T> failResponse(CodeConstant errorConstant) {
        ResponseVO<T> responseVO = new ResponseVO<>();
        responseVO.setMsg(errorConstant.msg());
        responseVO.setCode(errorConstant.code());
        return responseVO;
    }

    public static <T> ResponseVO<T> successResponse(T data) {
        ResponseVO responseVO = new ResponseVO();
        responseVO.setCode(CodeConstant.SUCCESS.code());
        responseVO.setMsg(CodeConstant.SUCCESS.msg());
        responseVO.setData(null == data ? new JSONObject() : data);
        return responseVO;
    }
}
