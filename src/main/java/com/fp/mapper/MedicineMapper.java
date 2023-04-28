package com.fp.mapper;

import com.fp.domain.medicine.Medicine;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MedicineMapper {

    @Select("SELECT MID, MCODE, MNAME, MPRICE, MDESCRIPTION, MIMAGE, MTIMES, MDOSAGE, MBUILDER, MBUILDTIME, MUPDATER, MUPDATETIME FROM T_MEDICINE WHERE MSTATE='001'")
    List<Medicine> medicineList();

    @Select("SELECT T_MEDICINE.MID, MCODE, MNAME, MPRICE, MDESCRIPTION, MIMAGE, MTIMES, MDOSAGE, MBUILDER, MBUILDTIME, MUPDATER, MUPDATETIME FROM T_MEDICINE LEFT JOIN T_USER_MEDICINE ON T_MEDICINE.MID = T_USER_MEDICINE.MID WHERE MSTATE='001' AND UID=#{uid}")
    List<Medicine> medicineListByUid(Integer uid);

    @Delete("DELETE FROM T_USER_MEDICINE WHERE UID=#{uid}")
    void deleteAllByUid(Integer uid);

    @Insert("INSERT INTO T_USER_MEDICINE(UID, MID) VALUES(#{uid}, #{mid})")
    void save(Integer uid, Integer mid);

}
