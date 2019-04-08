# struts_test
some code for studing struts2 
运行环境：Intellij 2018 / jdk 1.8.0_181 / apache-tomcat-9.0.17 / struts2官网：struts-2.5.20-all
从一个小的登录业务功能体会struts2
实现了：
1、struts2 三种获得客户端输入的方法
2、实现并配置action类（LoginAction.java和struts.xml）
3、实现了自定义验证器，即验证码功能（SecurityCodeValidator.java、validator.xml、LoginAction-validation.xml）
4、实现了自定义类型转换器（BirthDayConverter.java、xwork-conversion.properties）
5、国际化（struts.xml、message_zh_CN.properties）
6、令牌
7、跳转等待界面
