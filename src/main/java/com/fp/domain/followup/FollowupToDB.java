package com.fp.domain.followup;

import lombok.Data;

@Data
public class FollowupToDB {
    private int uid;
    private int did;
    private String dname;
    private String fcontent;
    private String ftime;
}
