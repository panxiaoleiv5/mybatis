package com.pxl.demo.service.impl;

import com.pxl.demo.dao.UserMapper;
import com.pxl.demo.entity.User;
import com.pxl.demo.service.UserInfoService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author pxl
 * @description
 * @date 2018/11/28 15:31
 */
public class UserInfoServiceImpl implements UserInfoService {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = null;
        try {
            //这个resource类似于src和classpath
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //将SqlSessionFactoryBuilder当成一个工具类使用即可，不需要使用单例管理SqlSessionFactoryBuilder。
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Override
    public User loadUser(Long id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.loadUserByUserId(id);
        sqlSession.close();
        return user;
    }
}
