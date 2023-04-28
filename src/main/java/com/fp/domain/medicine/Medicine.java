package com.fp.domain.medicine;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Medicine {
    private Integer mid;
    private String mcode;
    private String mname;
    private Long mprice;
    private String mdescription;
    private String mimage;
    private String mtimes;
    private String mdosage;
    private Integer mbuilder;
    private Timestamp mbuildtime;
    private Integer mupdater;
    private Timestamp mupdatetime;
}
