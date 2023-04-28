package com.fp.service.impl;

import com.fp.domain.followup.Followup;
import com.fp.domain.followup.FollowupToDB;
import com.fp.mapper.FollowupMapper;
import com.fp.service.FollowupService;
import com.fp.util.TimeHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class FollowupServiceImpl implements FollowupService {

    @Autowired
    private FollowupMapper followupMapper;

    @Override
    public void save(FollowupToDB followupToDB) {
        Followup followup = new Followup();
        followup.setFcode(UUID.randomUUID().toString());
        followup.setUid(followupToDB.getUid());
        followup.setDid(followupToDB.getDid());
        followup.setFcontent(followupToDB.getFcontent());
        try {
            followup.setFtime(new Timestamp(TimeHandler.handleTimeToLong(followupToDB.getFtime())));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        followupMapper.save(followup);
    }

    @Override
    public List<FollowupToDB> followupsByUid(Integer uid) {
        List<Followup> followups = followupMapper.followupsByUid(uid);
        List<FollowupToDB> followupToDBS = new ArrayList<>();
        for (Followup followup : followups){
            FollowupToDB followupToDB = new FollowupToDB();
            followupToDB.setUid(followup.getUid());
            followupToDB.setDid(followup.getDid());
            followupToDB.setDname(followup.getDname());
            followupToDB.setFcontent(followup.getFcontent());
            followupToDB.setFtime(followup.getFtime().toString().substring(0, followup.getFtime().toString().length()-2));
            followupToDBS.add(followupToDB);
        }
        return followupToDBS;
    }
}
