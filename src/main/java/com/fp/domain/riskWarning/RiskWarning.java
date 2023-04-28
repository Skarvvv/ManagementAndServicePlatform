package com.fp.domain.riskWarning;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class RiskWarning {
    private int rid;
    private String rcode;
    private int uid;
    private int did;
    private String rtitle;
    private String rcontent;
    private Timestamp rtime;
}
