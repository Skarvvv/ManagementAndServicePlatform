package com.fp.domain.status;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Status {

    private int sid;
    private String scode;
    private int uid;
    private String scontent;
    private Timestamp stime;
    private Double lowTemp;
    private Double highTemp;
    private Double currentTemp;
    private String simage;

}
