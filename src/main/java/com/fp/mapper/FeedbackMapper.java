package com.fp.mapper;

import com.fp.domain.feedback.Feedback;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FeedbackMapper {

    @Select("SELECT FID, FCODE, UID, FCONTENT, FTIME FROM T_FEEDBACK WHERE UID = #{uid} AND FSTATE='001'")
    List<Feedback> feedbacksByUid(int uid);

    @Insert("INSERT INTO T_FEEDBACK(FCODE, UID, FCONTENT, FTIME, FSTATE) VALUES(#{fcode}, #{uid}, #{fcontent}, #{ftime}, '001')")
    void save(Feedback feedback);

}
