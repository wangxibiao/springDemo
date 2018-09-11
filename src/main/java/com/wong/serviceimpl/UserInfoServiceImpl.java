package com.wong.serviceimpl;

import com.wong.model.UserInfo;
import com.wong.service.UserInfoService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserInfoServiceImpl implements UserInfoService {
    /**
     * setter
     */
    public void getUserInfo(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("UserInfo.xml");
        UserInfo u = beanFactory.getBean("userInfoSetter", UserInfo.class);
        System.out.println(u.getName());
    }
    /**
     * 构造注入
     */
    public void getUserInfoConstrutor(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("UserInfo.xml");
        UserInfo u = beanFactory.getBean("userInfoConstrutor", UserInfo.class);
        System.out.println(u.getName());
    }
    /**
     * 静态工厂注入
     */
    public void getUserInfoStaticFactory(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("UserInfo.xml");
        UserInfo u = beanFactory.getBean("userInfoStaticFactory", UserInfo.class);
        System.out.println(u.getName());
    }
    /**
     * 实例工厂注入
     */
    public void getUserInfoInstanceFactory(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("UserInfo.xml");
        UserInfo u = beanFactory.getBean("instanceFactory", UserInfo.class);
        System.out.println(u.getName());
    }
}
