package com.fp.service;

import com.fp.domain.symptom.SymptomToDB;

import java.util.List;

public interface SymptomService {

    void save(SymptomToDB symptomToDB);

    List<SymptomToDB> symptomsByUid(Integer uid);

}
