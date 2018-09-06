package com.wong.model;

import com.wong.service.UserInfoService;
import com.wong.serviceimpl.UserInfoServiceImpl;
import org.junit.Test;

public class UserInfoTest {

    @Test
    public void getUserInfo(){
        UserInfoService s = new UserInfoServiceImpl();
        s.getUserInfo();
    }
    @Test
    public void getUserInfoConstrutorTest(){
        UserInfoService s = new UserInfoServiceImpl();
        s.getUserInfoConstrutor();
    }
    @Test
    public void getUserInfoStaticFactory(){
        UserInfoService s = new UserInfoServiceImpl();
        s.getUserInfoStaticFactory();
    }

    @Test
    public void getUserInfoInstanceFactory(){
        UserInfoService s = new UserInfoServiceImpl();
        s.getUserInfoInstanceFactory();
    }
}
