package com.fp.domain.feedback;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Feedback {
    private int fid;
    private String fcode;
    private int uid;
    private String fcontent;
    private Timestamp ftime;
}
