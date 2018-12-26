package com.pxl.demo.service;

import com.pxl.demo.entity.User;

/**
 * @author pxl
 * @description
 * @date 2018/11/28 15:30
 */
public interface UserInfoService {
    User loadUser(Long id);
}
