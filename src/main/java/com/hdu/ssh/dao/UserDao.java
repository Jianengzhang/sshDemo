package com.hdu.ssh.dao;

import com.hdu.ssh.pojo.User;

public interface UserDao {
    User findUserByUserName(String userName);
    void updateUser(User user);
}
