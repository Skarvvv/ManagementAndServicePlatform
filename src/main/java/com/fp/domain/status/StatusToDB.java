package com.fp.domain.status;

import lombok.Data;

@Data
public class StatusToDB {

    private int uid;
    private String statusContent;
    private String stime;
    private Double lowTemp;
    private Double highTemp;
    private Double currentTemp;
    private String simage;

}
