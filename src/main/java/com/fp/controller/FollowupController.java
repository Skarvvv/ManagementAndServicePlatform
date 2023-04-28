package com.fp.controller;

import com.fp.domain.followup.Followup;
import com.fp.domain.followup.FollowupToDB;
import com.fp.service.FollowupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("followup")
public class FollowupController {

    @Autowired
    private FollowupService followupService;

    @GetMapping("save")
    public void save(FollowupToDB followUpScheduleToDB){
        followupService.save(followUpScheduleToDB);
    }
    @GetMapping("followupsByUid")
    public List<FollowupToDB> followupsByUid(Integer uid){
        return followupService.followupsByUid(uid);
    }

}
