package com.fp.domain;

import lombok.Data;

import java.sql.Date;

@Data
public class Doctor {
    private int did;
    private String dcode;
    private String dname;
    private String dpassword;
    private String davatar;
    private String drealname;
    private String dgender;
    private Date dbirthday;
    private String dtel;
    private String didentity;
}
