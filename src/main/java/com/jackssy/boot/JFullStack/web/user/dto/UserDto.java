package com.jackssy.boot.JFullStack.web.user.dto;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class UserDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "年龄")
    private Integer age;

    @ApiModelProperty(value = "邮箱")
    private String email;
}
