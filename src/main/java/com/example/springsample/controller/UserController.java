package com.example.springsample.controller;


import com.example.springsample.model.User;
import com.example.springsample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/user/list", method = RequestMethod.GET)
    public String displayList(Model model){
        List<User> userList = userService.searchAll();
        model.addAttribute("userlist",userList);
        return "user/list";
    }
}
