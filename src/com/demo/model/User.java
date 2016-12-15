package com.demo.model;

import com.jfinal.plugin.activerecord.Model;

/**
 * 该文件保存的是数据实体
 */
public class User extends Model<User> {
    public static User userDao = new User();
}
