package com.fp.domain.followup;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Followup {
    private int fid;
    private String fcode;
    private int uid;
    private int did;
    private String dname;
    private String fcontent;
    private Timestamp ftime;
}
