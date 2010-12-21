package com.live.webmail.model;

import com.live.webmail.base.DomainObject;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 10-11-29
 * Time: 上午11:13
 */
public class User extends DomainObject {
    private String name;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
