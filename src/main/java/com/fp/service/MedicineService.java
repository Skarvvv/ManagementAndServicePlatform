package com.fp.service;

import com.fp.domain.medicine.Medicine;

import java.util.List;

public interface MedicineService {
    List<Medicine> medicineList();
    List<Medicine> medicineListByUid(Integer uid);
    void distributeMedicines(Integer uid, int[] medicines);
}
