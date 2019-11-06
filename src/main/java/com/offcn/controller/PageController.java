package com.offcn.controller;

import com.offcn.dao.UserDao;
import com.offcn.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/page")
public class PageController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("/list")
    /*public String getAllList(Model model){
        List<User> userList = userDao.findAll();
        model.addAttribute("userList",userList);
        return "user";
    }*/
    public ModelAndView getAllList(){
        List<User> userList = userDao.findAll();
        ModelAndView mv = new ModelAndView("user");
        mv.addObject("userList",userList);
        return mv;
    }
}
