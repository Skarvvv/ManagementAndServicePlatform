package com.fp.service;

import com.fp.domain.user.User;
import com.fp.domain.user.UserForLogin;
import com.fp.domain.user.UserToDB;

import java.util.List;

public interface UserService {
    User userInfo(UserForLogin userForLogin);
    List<User> userList();
    User updateInformation(UserToDB userToDB);
    void updatePassword(UserToDB userToDB);
    void save(UserToDB userToDB);
}
