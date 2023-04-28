package com.fp.mapper;

import com.fp.domain.user.User;
import com.fp.domain.user.UserToDB;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT UID, UCODE, UNAME, UPASSWORD, UAVATAR, UREALNAME, UGENDER, UBIRTHDAY, UTEL, UIDENTITY FROM T_USER WHERE UNAME=#{uname} AND UPASSWORD=#{upassword} AND USTATE='001'")
    User userInfo(String uname, String upassword);
    @Select("SELECT UID, UCODE, UNAME, UPASSWORD, UAVATAR, UREALNAME, UGENDER, UBIRTHDAY, UTEL, UIDENTITY FROM T_USER WHERE UID=#{uid}")
    User userByUid(Integer uid);
    @Select("SELECT UID, UCODE, UNAME, UPASSWORD, UAVATAR, UREALNAME, UGENDER, UBIRTHDAY, UTEL, UIDENTITY FROM T_USER WHERE USTATE='001'")
    List<User> userList();
    @Update("UPDATE T_USER SET UNAME=#{uname}, UREALNAME=#{urealname}, UGENDER=#{ugender}, UBIRTHDAY=#{ubirthday}, UTEL=#{utel}, UIDENTITY=#{uidentity} WHERE UID=#{uid} AND USTATE='001'")
    void updateInformation(User user);
    @Update("UPDATE T_USER SET UPASSWORD=#{upassword} WHERE UID=#{uid} AND USTATE='001'")
    void updatePassword(User user);
    @Insert("INSERT INTO T_USER(UCODE, UNAME, UPASSWORD, UAVATAR, UREALNAME, UGENDER, UBIRTHDAY, UTEL, UIDENTITY, USTATE) VALUES(#{ucode}, #{uname}, #{upassword}, #{uavatar}, #{urealname}, #{ugender}, #{ubirthday}, #{utel}, #{uidentity}, '001')")
    void save(UserToDB userToDB);
}
