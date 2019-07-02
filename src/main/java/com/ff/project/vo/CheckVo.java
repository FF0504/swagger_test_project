package com.ff.project.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author: FF
 * @Date: 2019/7/2 11:38
 * @Version 1.0
 */
@Data
@ApiModel("测试check")
public class CheckVo {

    @ApiModelProperty(value = "年龄", required = true)
    private String age;
    @ApiModelProperty(value = "名字", required = true)
    private String name;
    @ApiModelProperty(value = "爱好")
    private String hobby;
}
