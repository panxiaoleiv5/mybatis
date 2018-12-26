package com.pxl.demo.dao;

import com.pxl.demo.entity.User;

/**
 * Created by Chou on 2018/2/1.
 */
public interface UserMapper {

    User loadUserByUserId(Long userId);

}
