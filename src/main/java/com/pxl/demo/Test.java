package com.pxl.demo;

import com.pxl.demo.entity.User;
import com.pxl.demo.service.UserInfoService;
import com.pxl.demo.service.impl.UserInfoServiceImpl;

/**
 * @author pxl
 * @description
 * @date 2018/11/28 16:07
 */
public class Test {
    public static void main(String[] args) {
        UserInfoService userInfoService = new UserInfoServiceImpl();
        User user = userInfoService.loadUser(1L);
        System.out.println(user.toString());
    }
}
