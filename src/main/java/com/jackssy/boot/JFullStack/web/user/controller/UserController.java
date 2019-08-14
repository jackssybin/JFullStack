package com.jackssy.boot.JFullStack.web.user.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jackssy.boot.JFullStack.common.api.ApiResult;
import com.jackssy.boot.JFullStack.web.user.dto.UserDto;
import com.jackssy.boot.JFullStack.web.user.dto.UserQueryParm;
import com.jackssy.boot.JFullStack.web.user.entity.User;
import com.jackssy.boot.JFullStack.web.user.service.IUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jackssy
 * @since 2019-08-15
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/list")
    @ApiOperation(value = "获取user分页列表",notes = "系统用户分页列表",response = UserDto.class)
    public ApiResult<IPage<UserDto>> getSysLogPageList() throws Exception{
        Page page =new Page(1,10);
        QueryWrapper<User> userQueryWrapper = Wrappers.query();
        IPage<UserDto> paging = userService.page(page,userQueryWrapper);
        return ApiResult.ok(paging);
    }
}
