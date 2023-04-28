package com.fp.mapper;

import com.fp.domain.Doctor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DoctorMapper {
    @Select("SELECT DID, DCODE, DNAME, DPASSWORD, DAVATAR, DREALNAME, DGENDER, DBIRTHDAY, DTEL, DIDENTITY FROM T_DOCTOR WHERE DSTATE='001'")
    List<Doctor> doctorList();

    @Select("SELECT DREALNAME FROM T_DOCTOR WHERE DID=#{did}")
    String selectDoctorRealNameByDid(Integer did);
}
