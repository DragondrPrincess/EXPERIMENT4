# 实验四 - Web编程之前后端整合

## 项目介绍
在实验三的基础上，将前端Vue静态资源整合到SSM后端项目中，统一使用Tomcat部署。

## 技术栈
- 后端：Spring MVC + MyBatis + MySQL + Druid
- 前端：Vue 2 + Axios + Bootstrap 5
- 部署：Tomcat 9（端口8081）

## 功能
- 前后端整合部署，统一入口
- 用户登录接口 POST /user/login
- 用户注册接口 POST /user/register

## 运行说明
1. 创建MySQL数据库 ssm_test，新建user表
2. 修改 db.properties 中的数据库密码
3. 使用IDEA + Smart Tomcat插件启动项目
4. 访问 http://localhost:8081/experiment4/index.html
