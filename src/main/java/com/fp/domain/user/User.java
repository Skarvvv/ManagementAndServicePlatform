package com.fp.domain.user;

import lombok.*;

import java.sql.Date;

@Data
public class User {

    private int uid;
    private String ucode;
    private String uname;
    private String upassword;
    private String uavatar;
    private String urealname;
    private String ugender;
    private Date ubirthday;
    private String utel;
    private String uidentity;

}
