package com.fp.service.impl;

import com.fp.domain.status.Status;
import com.fp.domain.status.StatusToDB;
import com.fp.mapper.StatusMapper;
import com.fp.service.StatusService;
import com.fp.util.TimeHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StatusServiceImpl implements StatusService {

    @Autowired
    private StatusMapper statusMapper;

    @Override
    public void save(StatusToDB statusToDB) {
        Status status = new Status();
        status.setScode(UUID.randomUUID().toString());
        status.setUid(statusToDB.getUid());
        status.setScontent(statusToDB.getStatusContent());
        try {
            status.setStime(new Timestamp(TimeHandler.handleTimeToLong(statusToDB.getStime())));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        status.setLowTemp(statusToDB.getLowTemp());
        status.setHighTemp(statusToDB.getHighTemp());
        status.setCurrentTemp(statusToDB.getCurrentTemp());
        status.setSimage(statusToDB.getSimage());
        statusMapper.save(status);
    }

    @Override
    public List<StatusToDB> statusInspectionByUid(Integer uid) {
        List<Status> statuses = statusMapper.statusInspectionByUid(uid);
        List<StatusToDB> statusToDBList = new ArrayList<>();
        for (Status status : statuses){
            StatusToDB statusToDB = new StatusToDB();
            statusToDB.setUid(status.getUid());
            statusToDB.setStatusContent(status.getScontent());
            statusToDB.setStime(status.getStime().toString().substring(0, status.getStime().toString().length()-2));
            statusToDB.setLowTemp(status.getLowTemp());
            statusToDB.setHighTemp(status.getHighTemp());
            statusToDB.setCurrentTemp(status.getCurrentTemp());
            statusToDB.setSimage(status.getSimage());
            statusToDBList.add(statusToDB);
        };
        return statusToDBList;
    }
}
