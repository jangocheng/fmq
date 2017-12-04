package com.fmq.common.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping(value = "/user/userInfo", method = RequestMethod.GET)
    public UserDTO findByid(@RequestParam(value = "id", required = true) String id) {
        return userService.findUerById(id);
    }
    
    @RequestMapping(value = "/user/findAll", method = RequestMethod.GET)
    public List<UserDTO> findAll() {
    	return userService.findAll();
    }
    
    
    @RequestMapping("/user/saveUser")
    public void saveUser(@RequestParam(value = "userName", required = true) String userName,
            @RequestParam(value = "passWord", required = true) String passWord) {
    	
    		UserDTO userDto =new UserDTO();
    		userDto.setUserName(userName);
        	userDto.setPassWord(passWord);
       	userService.saveUser(userDto);
    	
    }
    @RequestMapping("/user/updateUser")
    public void updateUser(@RequestParam(value = "userName", required = true) String userName,
    		                  @RequestParam(value = "passWord", required = true) String passWord) {
    	UserDTO userDto =new UserDTO();
    	userDto.setUserName(userName);
    	userDto.setPassWord(passWord);
    	userService.updateUser(userDto);
    	
    }
    @RequestMapping("/user/deleteUser")
    public void deleteUser(@RequestParam(value = "id", required = true) String id) {
    	userService.deleteUser(id);
    	
    }
    

}
