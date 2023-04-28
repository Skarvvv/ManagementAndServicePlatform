package com.fp.service.impl;

import com.fp.domain.riskWarning.RiskWarning;
import com.fp.domain.riskWarning.RiskWarningToDB;
import com.fp.mapper.DoctorMapper;
import com.fp.mapper.RiskWarningMapper;
import com.fp.service.RiskWarningService;
import com.fp.util.TimeHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@Service
public class RiskWarningServiceImpl implements RiskWarningService {

    @Autowired
    private RiskWarningMapper riskWarningMapper;
    @Autowired
    private DoctorMapper doctorMapper;

    @Override
    public List<RiskWarningToDB> riskWarningsByUid(Integer uid) {
        List<RiskWarning> riskWarnings = riskWarningMapper.riskWarningsByUid(uid);
        List<RiskWarningToDB> riskWarningList = new ArrayList<RiskWarningToDB>();
        for (RiskWarning riskWarning : riskWarnings){
            RiskWarningToDB riskWarningToDB = new RiskWarningToDB();
            riskWarningToDB.setRid(riskWarning.getRid());
            riskWarningToDB.setRcode(riskWarning.getRcode());
            riskWarningToDB.setDrealname(doctorMapper.selectDoctorRealNameByDid(riskWarning.getDid()));
            riskWarningToDB.setRtitle(riskWarning.getRtitle());
            riskWarningToDB.setRcontent(riskWarning.getRcontent());
            riskWarningToDB.setRtime(riskWarning.getRtime().toString());
            riskWarningList.add(riskWarningToDB);
        }
        return riskWarningList;
    }
}
