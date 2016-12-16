# 项目通用框架DEMO

## 简介
本DEMO用来演示目前阶段项目使用的项目开发技术栈，采用最简洁的MVC架构展示，开发人员通过研究本DEMO可以快速掌握软件开发流程，并参与到流程开发中来。

##适用项目
- LIMS_Path_V2
- Blog

##项目部署
1. 访问Oracle[官网](http://www.oracle.com/technetwork/cn/java/javase/downloads/jdk8-downloads-2133151-zhs.html "官网")，下载Java Develop KIt开发组件（JDK），推荐下载JDK 7.x版本。
1. 配置本地JAVA环境变量，[参考此处](http://jingyan.baidu.com/article/a24b33cd59b58e19fe002bb9.html "参考此处")。
1. 访问Apache Tomcat的[官网](http://tomcat.apache.org/ "官网")下载7.x版本的Apache Tomcat服务器。
1. 通过Clone或者Download下载本项目，部署至Tomcat服务器的webapps目录下。
1. 安装Mysql数据库，创建新数据库，名为“framework_demo”。
1. 访问项目根目录/web/framework_demo.sql，执行SQL文件。
1. 访问/bin/startup.sh(startup.bat)，启动Tomcat服务器。
1. 访问http://localhost:8080/项目名 。

##其他部署方式
- 使用Intellij IDEA 打开。
- 使用MyEclipse 打开。

##项目介绍
###前端技术栈
- 框架：采用经典的Vue.js框架作为技术架构，Vue.js的使用教程建议参考官方[Guide](http://cn.vuejs.org/v2/guide/ "Guide")，
- 模板 页面采用国外较为流行的Bracket的Bootstrap框架作为模板，具体模板样式见[官网](https://themeforest.net/item/bracket-responsive-bootstrap-3-admin-template/6894362 "官网")
- 通信 模板的导入采用经典的Ajax通信技术从目录中调取，数据的前后端交互采用Promise协议，使用Vue-resource插件进行实现，使用细节请查看[Github](https://github.com/pagekit/vue-resource "Github")。

###后端技术栈
- 架构：后端整体架构采用JFinal框架。JFinal 是基于Java 语言的极速 web 开发框架，其核心设计目标是开发迅速、代码量少、学习简单、功能强大、轻量级、易扩展、Restful。JFinal使用教程见官方[开发社区](http://www.jfinal.com/ "开发社区")。
- 数据库：数据库采用Mysql作为主数据库，若涉及缓存，则采用Redis作为缓存数据库选择。

##联系作者
瞿龙俊
qulongjun12@163.com