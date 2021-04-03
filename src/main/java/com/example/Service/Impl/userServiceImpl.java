package com.example.Service.Impl;

import com.example.Service.UserServices;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements UserServices {
    @Override
    public String findAllUsers() {
        return "user all";
    }
}
