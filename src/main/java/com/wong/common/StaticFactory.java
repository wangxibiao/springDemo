package com.wong.common;

import com.wong.model.UserInfo;

public class StaticFactory {

    public static UserInfo staticFactory(Integer id,String name){
        return new UserInfo(id,name);
    }
}
