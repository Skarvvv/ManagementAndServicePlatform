package com.fp.service;

import com.fp.domain.followup.FollowupToDB;

import java.util.List;

public interface FollowupService {

    void save(FollowupToDB followupToDB);
    List<FollowupToDB> followupsByUid(Integer uid);

}
