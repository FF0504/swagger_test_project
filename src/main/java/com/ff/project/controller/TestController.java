package com.ff.project.controller;

import com.ff.project.common.AbstractBaseController;
import com.ff.project.service.TestService;
import com.ff.project.vo.CheckVo;
import com.ff.project.vo.ResponseVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: FF
 * @Date: 2019/7/2 11:02
 * @Version 1.0
 */
@Api(value = "测试接口", tags = "测试相关")
@RestController
@RequestMapping(value = "/test")
public class TestController extends AbstractBaseController{

    @Autowired
    private TestService testService;

    @ApiOperation(value = "测试一个接口", notes = "第一个接口")
    @PostMapping(value = "testHello",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseVO test(@Validated @ModelAttribute CheckVo checkVo, BindingResult bindingResult){
        return execute(()->testService.test(checkVo),bindingResult);
    }

    @ApiOperation(value = "测试第二个接口", notes = "测试第二个接口")
    @PostMapping(value = "testHello2",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseVO test2(@Validated @ModelAttribute CheckVo checkVo, BindingResult bindingResult){
        return execute(()->testService.test(checkVo),bindingResult);
    }

}



