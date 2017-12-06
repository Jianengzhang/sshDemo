package com.hdu.ssh.service;

import com.hdu.ssh.pojo.User;

import java.util.List;

public interface UserService {
    User checkLogin(User user) throws Exception;
    void saveRegister(User User) throws Exception;
    void updateUser(String userEmail) throws Exception;
}
