package com.gllis.iot.auth.security;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.gllis.iot.auth.entity.RoleEntity;
import com.gllis.iot.auth.entity.UserEntity;
import com.gllis.iot.auth.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * userDetailsService
 *
 * @author glli
 * @date 2023/9/1
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private IUserService iUserService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = iUserService.getOne(new LambdaQueryWrapper<UserEntity>().eq(UserEntity::getEmail, username), false);
        return new User(userEntity.getEmail(),
                userEntity.getPassword(), mapRolesToAuthorities(userEntity.getRoles()));
    }

    private Collection< ? extends GrantedAuthority> mapRolesToAuthorities(Set<RoleEntity> roles){
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
    }
}
