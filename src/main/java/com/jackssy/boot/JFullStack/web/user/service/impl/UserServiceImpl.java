package com.jackssy.boot.JFullStack.web.user.service.impl;

import com.jackssy.boot.JFullStack.web.user.entity.User;
import com.jackssy.boot.JFullStack.web.user.mapper.UserMapper;
import com.jackssy.boot.JFullStack.web.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jackssy
 * @since 2019-08-15
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
