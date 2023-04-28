package com.fp.controller;

import com.fp.domain.status.StatusToDB;
import com.fp.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("status")
public class StatusController {

    @Autowired
    private StatusService statusService;

    @GetMapping("save")
    public void save(StatusToDB statusToDB){
        statusService.save(statusToDB);
    }

    @GetMapping("statusInspectionByUid")
    public List<StatusToDB> statusInspectionByUid(Integer uid){
        return statusService.statusInspectionByUid(uid);
    }

}
