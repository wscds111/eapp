package com.dingding.modules.user.service.impl;

import com.dingding.modules.user.entity.User;
import com.dingding.modules.user.mapper.UserMapper;
import com.dingding.modules.user.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author caolei
 * @since 2019-04-28
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
