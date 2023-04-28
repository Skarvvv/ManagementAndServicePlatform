package com.fp.service.impl;

import com.fp.domain.symptom.Symptom;
import com.fp.domain.symptom.SymptomToDB;
import com.fp.mapper.SymptomMapper;
import com.fp.service.SymptomService;
import com.fp.util.TimeHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class SymptomServiceImpl implements SymptomService {

    @Autowired
    private SymptomMapper symptomMapper;

    @Override
    public void save(SymptomToDB symptomToDB) {
        Symptom symptom = new Symptom();
        symptom.setScode(UUID.randomUUID().toString());
        symptom.setUid(symptomToDB.getUid());
        symptom.setScontent(symptomToDB.getSymptomContent());
        try {
            symptom.setStime(new Timestamp(TimeHandler.handleTimeToLong(symptomToDB.getStime())));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        symptomMapper.save(symptom);
    }

    @Override
    public List<SymptomToDB> symptomsByUid(Integer uid) {
        List<Symptom> symptoms = symptomMapper.symptomsByUid(uid);
        List<SymptomToDB> symptomToDBSs = new ArrayList<>();
        for (Symptom symptom : symptoms){
            SymptomToDB symptomToDB = new SymptomToDB();
            symptomToDB.setUid(symptom.getUid());
            symptomToDB.setSymptomContent(symptom.getScontent());
            symptomToDB.setStime(symptom.getStime().toString());
            symptomToDBSs.add(symptomToDB);
        }
        return symptomToDBSs;
    }
}
