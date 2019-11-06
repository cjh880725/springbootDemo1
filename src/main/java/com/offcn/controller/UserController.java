package com.offcn.controller;

import com.offcn.Mapper.MUserMapper;
import com.offcn.POJO.MUser;
import com.offcn.dao.UserDao;
import com.offcn.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;
   /* @Autowired
    private MUserMapper mUserMapper;
    @RequestMapping("/list")
    public List<MUser> getUserList(){
        List<MUser> userList = mUserMapper.getUserList();
        return userList;
    }*/
    @RequestMapping("/list1")
    public List<User> getUserList1(){
        return userDao.findAll();
    }
}
