package com.fp.service.impl;

import com.fp.domain.Doctor;
import com.fp.mapper.DoctorMapper;
import com.fp.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorMapper doctorMapper;

    @Override
    public List<Doctor> doctorList() {
        return doctorMapper.doctorList();
    }
}
