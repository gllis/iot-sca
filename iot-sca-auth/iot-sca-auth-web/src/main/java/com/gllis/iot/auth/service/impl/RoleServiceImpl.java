package com.gllis.iot.auth.service.impl;

import com.gllis.iot.auth.entity.RoleEntity;
import com.gllis.iot.auth.mapper.RoleEntityMapper;
import com.gllis.iot.auth.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户角色表 服务实现类
 * </p>
 *
 * @author glli
 * @since 2023-09-02
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleEntityMapper, RoleEntity> implements IRoleService {

}
