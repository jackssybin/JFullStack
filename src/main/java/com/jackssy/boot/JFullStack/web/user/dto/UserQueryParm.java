package com.jackssy.boot.JFullStack.web.user.dto;

import com.jackssy.boot.JFullStack.common.api.QueryParam;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value="SysLogQueryParam对象", description="系统日志查询参数")
public class UserQueryParm extends QueryParam {
    private static final long serialVersionUID = 1L;
}
