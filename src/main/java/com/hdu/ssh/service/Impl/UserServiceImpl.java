package com.hdu.ssh.service.Impl;

import com.hdu.ssh.dao.UserDao;
import com.hdu.ssh.pojo.User;
import com.hdu.ssh.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    public User checkLogin(User user)throws Exception {
        User user1 =userDao.findUserByUserName(user.getUserName());
        //邮箱未注册
        if(null == user1){
            return null;
        }else {
            if(user1.getPassword().equals(user.getPassword())){
                return user1;
            }
        }
        return null;
    }

    public void saveRegister(User User) throws Exception {

    }

    public void updateUser(String userEmail) throws Exception {

    }
}
