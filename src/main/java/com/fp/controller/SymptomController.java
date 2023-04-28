package com.fp.controller;

import com.fp.domain.symptom.SymptomToDB;
import com.fp.service.SymptomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("symptom")
public class SymptomController {

    @Autowired
    private SymptomService symptomService;

    @GetMapping("save")
    public void save(SymptomToDB symptomToDB){
        symptomService.save(symptomToDB);
    }

    @GetMapping("symptomsByUid")
    public List<SymptomToDB> symptomsByUid(Integer uid){
        return symptomService.symptomsByUid(uid);
    }

}
