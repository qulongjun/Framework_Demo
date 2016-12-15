package com.demo.config;

import com.demo.controller.UserController;
import com.demo.model.User;
import com.jfinal.config.*;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.render.ViewType;

/**
 * Created by qulongjun on 2016/10/17.
 */
public class CommonConfig extends JFinalConfig {
    /**
     * 配置JFInal的常量
     *
     * @param me
     */
    @Override
    public void configConstant(Constants me) {
        //设置开发模式,如果设置为true,控制台会输出每次请求的Controller action和参数信息
        me.setDevMode(true);
        //设置视图模型
        me.setViewType(ViewType.JSP);
        me.setBaseViewPath("/");
        me.setUrlParaSeparator("-");
    }

    @Override
    public void configRoute(Routes me) {
        //前端页面路由
        me.add("/", UserController.class);
        me.add("/user", UserController.class);
    }

    @Override
    public void configPlugin(Plugins me) {
        C3p0Plugin cp = new C3p0Plugin("jdbc:mysql://localhost/framework_demo", "root", "jun920221");
        me.add(cp);
        ActiveRecordPlugin arp = new ActiveRecordPlugin(cp);
        me.add(arp);
        arp.addMapping("db_user", User.class);
    }

    @Override
    public void configInterceptor(Interceptors me) {
        //全局的登录拦截器
    }

    @Override
    public void configHandler(Handlers me) {

    }
}
