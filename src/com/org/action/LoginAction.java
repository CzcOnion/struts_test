package com.org.action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.org.bean.User;


public class LoginAction extends ActionSupport{

//    private User user = new User();//注意进行初始化
//    @Override
//    public User getModel() {
//        return user;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    @Override
//    public String execute() throws Exception{
//        if (user.getUsername().equals("admin") && user.getPassword().equals("123")) {
//            return SUCCESS;
//        } else {
//            return LOGIN;
//        }
//    }
    //使用基本属性获取客户端输入
//    private String username;
//    private String password;
//    private Date birthday;
//    @Override
//    public String execute() throws Exception {
//        if (username.equals("admin") && password.equals("123")) {
//
//            return SUCCESS;
//        } else {
//            return LOGIN;
//        }
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public Date getBirthday() {
//        return birthday;
//    }
//
//    public void setBirthday(Date birthday) {
//        this.birthday = birthday;
//    }
    //通过领域对象获取，客户端对应user.username
    private User user;
    private String securityCode;

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    @Override
    public String execute() throws Exception {
        try{
            Thread.sleep(6000);
            if (user.getUsername().equals("admin") && user.getPassword().equals("123")) {
                System.out.println(user.getBirthday());
                return SUCCESS;
            } else {
                return LOGIN;
            }
        }catch (InterruptedException e){
            e.printStackTrace();
            return INPUT;
        }
    }
    //普通校验，在execute之间会调用validate()或validateXXX()
//    public void validate(){
//        if(user.getUsername() == null || user.getUsername().trim().length() == 0){
//            addActionError("用户名不能为空");
//        }
//        else if(user.getPassword() == null || user.getPassword().trim().length() == 0){
//            addActionError("密码不能为空");
//        }
//    }
}
