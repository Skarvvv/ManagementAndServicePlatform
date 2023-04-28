package com.fp.controller;

import com.fp.domain.riskWarning.RiskWarningToDB;
import com.fp.service.RiskWarningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("riskWarning")
public class RiskWarningController {

    @Autowired
    private RiskWarningService riskWarningService;

    @GetMapping("riskWarningsByUid")
    public List<RiskWarningToDB> riskWarningsByUid(Integer uid){
        return riskWarningService.riskWarningsByUid(uid);
    }

}
