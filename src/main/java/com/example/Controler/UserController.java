package com.example.Controler;

import com.example.Service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserServices userServices;
    @RequestMapping("/all")
    public  String allUser(){
       return userServices.findAllUsers();
    }

}
