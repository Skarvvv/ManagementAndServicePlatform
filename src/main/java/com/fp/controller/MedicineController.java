package com.fp.controller;

import com.fp.domain.medicine.Medicine;
import com.fp.service.MedicineService;
import com.fp.util.ArrayHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("medicine")
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    @GetMapping("medicineList")
    public List<Medicine> medicineList(){
        return medicineService.medicineList();
    }
    @GetMapping("medicineListByUid")
    public List<Medicine> medicineListByUid(Integer uid){
        return medicineService.medicineListByUid(uid);
    }
    @GetMapping("distributeMedicines")
    public void distributeMedicines(@RequestParam("uid") Integer uid, @RequestParam("medicineChosen") Object medicineChosen){
        int[] medicines = ArrayHandler.arrayFromStringToInt((String) medicineChosen);
        medicineService.distributeMedicines(uid, medicines);
    }

}
