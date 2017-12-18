package com.hdu.ssh.station.pojo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "station")
public class Station {
    int stationId;
    String stationName;

    public int getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }
}
