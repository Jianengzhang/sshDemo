package com.hdu.ssh.dao.Impl;

import com.hdu.ssh.dao.UserDao;
import com.hdu.ssh.pojo.User;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    @Override
    public User findUserByUserName(String userName) {
        String hql = "from User where userName = ?";
        List<?> list =  this.getHibernateTemplate().find(hql,userName);
        if(list.size()>0){
            return (User) list.get(0);
        }else {
            return null;
        }

    }

    @Override
    public void updateUser(User user) {

    }
}
