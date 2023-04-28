package com.fp.controller;

import com.fp.domain.user.User;
import com.fp.domain.user.UserForLogin;
import com.fp.domain.user.UserToDB;
import com.fp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @RestController
 * @Controller + @RespondBody = 返回json格式的数据
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("userInfo")
    public User userInfo(UserForLogin userForLogin){
        return userService.userInfo(userForLogin);
    }

    @GetMapping("userList")
    public List<User> userList(){
        return userService.userList();
    }

    @GetMapping("updateInformation")
    public User updateInformation(UserToDB userToDB){
        return userService.updateInformation(userToDB);
    }

    @GetMapping("updatePassword")
    public void updatePassword(UserToDB userToDB){
        userService.updatePassword(userToDB);
    }

    @RequestMapping("save")
    public void save(UserToDB userToDB){
        userService.save(userToDB);
    }


}
