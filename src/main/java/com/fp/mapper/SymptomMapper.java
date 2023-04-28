package com.fp.mapper;

import com.fp.domain.symptom.Symptom;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SymptomMapper {

    @Insert("INSERT INTO T_SYMPTOM(SCODE, UID, SCONTENT, STIME, SSTATE) VALUES(#{scode}, #{uid}, #{scontent}, #{stime}, '001')")
    void save(Symptom symptom);

    @Select("SELECT SID, SCODE, UID, SCONTENT, STIME FROM T_SYMPTOM WHERE UID=#{uid} AND SSTATE='001'")
    List<Symptom> symptomsByUid(Integer uid);

}
