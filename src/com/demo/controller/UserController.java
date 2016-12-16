package com.demo.controller;

import com.demo.model.User;
import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户操作Controller
 */
public class UserController extends Controller {
    //当直接访问localhost:8080时,执行当前函数
    public void index() {
        render("/index.html");
    }

    /**
     * 显示用户列表
     */
    public void list() {
        try {
            String sql = "SELECT * FROM `db_user`";
            List<User> userList = User.userDao.find(sql);
            renderJson(userList);
        } catch (Exception e) {
            renderError(500);
        }
    }

    /**
     * 新增一个用户
     */
    public void add() {
        try {
            String name = getPara("name");
            String age = getPara("age");
            String tel = getPara("tel");
            String address = getPara("address");



            User user = new User();
            Boolean result = user.set("name", name).set("age", age).set("tel", tel).set("address", address).save();

            Map back = new HashMap();
            back.put("code", result ? 200 : 500);
            renderJson(back);
        } catch (Exception e) {
            renderError(500);
        }
    }


    /**
     * 删除一个用户
     */
    public void delete() {
        try {
            int id = getParaToInt("id");
            Boolean result = User.userDao.deleteById(id);
            Map back = new HashMap();
            back.put("code", result ? 200 : 500);
            renderJson(back);
        } catch (Exception e) {
            renderError(500);
        }
    }

    /**
     * 按照条件查询用户
     */
    public void select() {
        try {

        } catch (Exception e) {
            renderError(500);
        }
    }

    public void change() {
        try {
            int id = getParaToInt("id");
            String name = getPara("name");
            String age = getPara("age");
            String tel = getPara("tel");
            String address = getPara("address");

            User user = User.userDao.findById(id);
            Boolean result = user.set("name", name).set("age", age).set("tel", tel).set("address", address).update();

            Map back = new HashMap();
            back.put("code", result ? 200 : 500);
            renderJson(back);
        } catch (Exception e) {
            renderError(500);
        }
    }
}
