package com.fp.mapper;

import com.fp.domain.riskWarning.RiskWarning;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RiskWarningMapper {

    @Select("SELECT RID, RCODE, UID, DID, RTITLE, RCONTENT, RTIME FROM T_RISKWARNING WHERE UID=#{uid} AND RSTATE='001'")
    List<RiskWarning> riskWarningsByUid(Integer uid);

}
