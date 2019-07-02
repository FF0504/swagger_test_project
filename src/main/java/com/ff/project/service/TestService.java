package com.ff.project.service;

import com.alibaba.fastjson.JSONObject;
import com.ff.project.vo.CheckVo;
import com.ff.project.vo.ResponseVO;
import org.springframework.stereotype.Service;

/**
 * @Author: FF
 * @Date: 2019/7/2 11:33
 * @Version 1.0
 */
@Service
public class TestService {

    public ResponseVO test(CheckVo checkVo){

        return ResponseVO.successResponse(new JSONObject());
    }
}
