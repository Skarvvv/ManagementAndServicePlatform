package com.fp.mapper;

import com.fp.domain.followup.Followup;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FollowupMapper {

    @Insert("INSERT INTO T_FOLLOWUP(FCODE, UID, DID, FCONTENT, FTIME, FSTATE) VALUES(#{fcode}, #{uid}, #{did}, #{fcontent}, #{ftime}, '001')")
    void save(Followup followup);
    @Select("SELECT FID, FCODE, UID, T_FOLLOWUP.DID, DNAME, FCONTENT, FTIME FROM T_FOLLOWUP JOIN T_DOCTOR ON T_FOLLOWUP.DID=T_DOCTOR.DID WHERE UID=#{uid} AND FSTATE='001'")
    List<Followup> followupsByUid(Integer uid);

}
