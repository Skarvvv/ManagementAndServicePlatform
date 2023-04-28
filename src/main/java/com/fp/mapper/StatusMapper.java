package com.fp.mapper;

import com.fp.domain.status.Status;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StatusMapper {

    @Insert("INSERT INTO T_STATUS(SCODE, UID, SCONTENT, STIME, LOWTEMP, HIGHTEMP, CURRENTTEMP, SIMAGE, SSTATE) VALUES(#{scode}, #{uid}, #{scontent}, #{stime}, #{lowTemp}, #{highTemp}, #{currentTemp}, #{simage}, '001')")
    void save(Status status);
    @Select("SELECT SID, SCODE, UID, SCONTENT, STIME, LOWTEMP, HIGHTEMP, CURRENTTEMP, SIMAGE FROM T_STATUS WHERE UID=#{uid} AND SSTATE='001'")
    List<Status> statusInspectionByUid(Integer uid);

}
