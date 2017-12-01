package com.fmq.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fmq.common.dto.UserDTO;
import com.fmq.common.service.UserService;

/**
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/api/userInfo", method = RequestMethod.GET)
    public UserDTO findUserInfo(@RequestParam(value = "userName", required = true) String userName) {
        return userService.findUerByName(userName);
    }

}
