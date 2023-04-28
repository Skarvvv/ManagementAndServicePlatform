package com.fp.domain.riskWarning;

import lombok.Data;

@Data
public class RiskWarningToDB {
    private int rid;
    private String rcode;
    private String drealname;
    private String rtitle;
    private String rcontent;
    private String rtime;
}
