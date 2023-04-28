package com.fp.service;

import com.fp.domain.status.StatusToDB;

import java.util.List;

public interface StatusService {

    void save(StatusToDB statusToDB);

    List<StatusToDB> statusInspectionByUid(Integer uid);

}
