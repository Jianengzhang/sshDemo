package com.hdu.ssh.login.dao;

import com.hdu.ssh.login.pojo.User;

public interface UserDao {
    User findUserByUserName(String userName);
    void updateUser(User user);
}
