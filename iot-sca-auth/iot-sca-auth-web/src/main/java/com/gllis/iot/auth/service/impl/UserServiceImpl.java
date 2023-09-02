package com.gllis.iot.auth.service.impl;

import com.gllis.iot.auth.entity.UserEntity;
import com.gllis.iot.auth.mapper.UserEntityMapper;
import com.gllis.iot.auth.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author glli
 * @since 2023-09-02
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserEntityMapper, UserEntity> implements IUserService {

}
