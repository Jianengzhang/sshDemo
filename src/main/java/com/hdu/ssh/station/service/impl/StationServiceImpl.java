package com.hdu.ssh.station.service.impl;

import com.hdu.ssh.station.dao.StationDao;
import com.hdu.ssh.station.pojo.Station;
import com.hdu.ssh.station.service.StationService;

import java.util.List;

public class StationServiceImpl implements StationService{
    private StationDao stationDao;

    public void setStationDao(StationDao stationDao) {
        this.stationDao = stationDao;
    }

    public List<Station> GetAllStation() {
        return stationDao.GetAllStation();
    }
}
