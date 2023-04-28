package com.fp.domain.symptom;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Symptom {
    private int sid;
    private String scode;
    private int uid;
    private String scontent;
    private Timestamp stime;
}
