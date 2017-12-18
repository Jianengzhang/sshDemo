package com.hdu.ssh.login.service;

import com.hdu.ssh.login.pojo.User;

public interface UserService {
    User checkLogin(User user) throws Exception;
    void saveRegister(User User) throws Exception;
    void updateUser(String userEmail) throws Exception;
}
