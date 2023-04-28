package com.fp.controller;

import com.fp.domain.Doctor;
import com.fp.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("doctorList")
    public List<Doctor> doctorList(){
        return doctorService.doctorList();
    }

}
