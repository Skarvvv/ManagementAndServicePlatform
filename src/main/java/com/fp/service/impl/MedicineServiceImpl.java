package com.fp.service.impl;

import com.fp.domain.medicine.Medicine;
import com.fp.mapper.MedicineMapper;
import com.fp.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineServiceImpl implements MedicineService {

    @Autowired
    private MedicineMapper medicineMapper;

    @Override
    public List<Medicine> medicineList() {
        return medicineMapper.medicineList();
    }

    @Override
    public List<Medicine> medicineListByUid(Integer uid) {
        return medicineMapper.medicineListByUid(uid);
    }

    @Override
    public void distributeMedicines(Integer uid, int[] medicines) {
        medicineMapper.deleteAllByUid(uid);
        for (int i = 0; i<medicines.length; i++){
            if (medicines[i] == 1) {
                medicineMapper.save(uid, i + 1);
            }
        }
    }
}
