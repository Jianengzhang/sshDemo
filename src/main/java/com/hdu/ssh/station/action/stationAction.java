package com.hdu.ssh.station.action;

import com.hdu.ssh.station.service.StationService;
import com.opensymphony.xwork2.ActionContext;

public class stationAction {
    private StationService stationService;

    public void setStationService(StationService stationService) {
        this.stationService = stationService;
    }

    public String OptionStation(){

        ActionContext.getContext().getSession().put("station",stationService.GetAllStation());
        return "homePage";
    }
}
