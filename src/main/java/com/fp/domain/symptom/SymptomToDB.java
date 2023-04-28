package com.fp.domain.symptom;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class SymptomToDB {
    private int uid;
    private String symptomContent;
    private String stime;
}
