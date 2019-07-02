package com.ff.project.common;

import com.ff.project.vo.ResponseVO;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.List;
import java.util.function.Supplier;

/**
 * @Author: FF
 * @Date: 2019/7/2 11:04
 * @Version 1.0
 */
public class AbstractBaseController {

    /**
     * @param supplier      supplier service
     * @param bindingResult check bingingResult
     * @param <T>           all DTO
     * @return supplier result
     */
    protected <T> T execute(Supplier<T> supplier, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            FieldError fieldError = fieldErrors.get(0);
            return (T) ResponseVO.failResponse(CodeConstant.PARAM_ERROR, fieldError.getDefaultMessage());
        }
        return supplier.get();

    }
}
