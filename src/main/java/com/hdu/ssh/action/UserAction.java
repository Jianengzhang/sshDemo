package com.hdu.ssh.action;

import com.hdu.ssh.pojo.User;
import com.hdu.ssh.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserAction extends ActionSupport implements ModelDriven<User> {
    private User user = new User();
    private UserService userService;

    //此需要导入struts2-spring-plugin-2.3.20.jar包
    //则struts和spring整合实现了按名称自动注入service。
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public User getModel() {
        return user;
    }

    public String login() throws Exception {
        //调用Service
        User existUser = userService.checkLogin(user);
        if(null != existUser){
            List<User> arrays =new ArrayList<User>();
            arrays.add(existUser);
            ActionContext.getContext().getSession().put("existUser",arrays);
            System.out.println(arrays.get(0).getUserName()+arrays.get(0).getPassword());
            return SUCCESS;
        }else {
            this.addActionError("用户名或者密码错误");
            return INPUT;
        }
    }
    public void save(){

    }
}
