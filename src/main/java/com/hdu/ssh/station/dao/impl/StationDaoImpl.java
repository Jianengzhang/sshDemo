package com.hdu.ssh.station.dao.impl;

import com.hdu.ssh.station.dao.StationDao;
import com.hdu.ssh.station.pojo.Station;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class StationDaoImpl extends HibernateDaoSupport implements StationDao{
    public List<Station> GetAllStation() {
        String hql = "from Station";
        List<?> list =  this.getHibernateTemplate().find(hql);
        return (List<Station>) list;
    }
}
