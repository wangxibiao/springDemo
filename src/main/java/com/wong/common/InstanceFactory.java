package com.wong.common;

import com.wong.model.UserInfo;

public class InstanceFactory {
    public UserInfo getUserInfoInstanceFactory(Integer id, String name) {
        return new UserInfo(id, name);
    }
}
