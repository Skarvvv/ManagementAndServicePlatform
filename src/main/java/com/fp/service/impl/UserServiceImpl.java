package com.fp.service.impl;

import com.fp.domain.user.User;
import com.fp.domain.user.UserForLogin;
import com.fp.domain.user.UserToDB;
import com.fp.service.UserService;
import com.fp.mapper.UserMapper;
import com.fp.util.TimeHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.text.ParseException;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User userInfo(UserForLogin userForLogin) {
        String uname = userForLogin.getUname();
        String upassword = userForLogin.getUpassword();
        return userMapper.userInfo(uname, upassword);
    }

    public List<User> userList(){
        return userMapper.userList();
    }

    @Override
    public User updateInformation(UserToDB userToDB) {
        User user = new User();
        user.setUid(userToDB.getUid());
        user.setUname(userToDB.getUname());
        user.setUrealname(userToDB.getUrealname());
        user.setUgender(userToDB.getUgender());
        try {
            user.setUbirthday(new Date(TimeHandler.handleDateToLong(userToDB.getUbirthday())));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        user.setUtel(userToDB.getUtel());
        user.setUidentity(userToDB.getUidentity());
        userMapper.updateInformation(user);
        return userMapper.userByUid(user.getUid());
    }

    @Override
    public void updatePassword(UserToDB userToDB) {
        User user = new User();
        user.setUid(userToDB.getUid());
        user.setUpassword(userToDB.getUpassword());
        userMapper.updatePassword(user);
    }

    @Override
    public void save(UserToDB userToDB) {
        User user = new User();
        userToDB.setUcode(UUID.randomUUID().toString());
        userMapper.save(userToDB);
    }

}
