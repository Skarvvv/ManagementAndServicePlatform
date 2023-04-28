package com.fp.service;

import com.fp.domain.riskWarning.RiskWarningToDB;

import java.util.List;

public interface RiskWarningService {
    List<RiskWarningToDB> riskWarningsByUid(Integer uid);
}
