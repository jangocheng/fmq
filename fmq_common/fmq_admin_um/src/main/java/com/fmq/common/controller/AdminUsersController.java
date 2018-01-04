package com.fmq.common.controller;

import com.fmq.common.base.BaseController;
import com.fmq.common.controller.form.AdminUsersForm;
import com.fmq.common.dto.AdminUsersDTO;
import com.fmq.common.dto.UserDTO;
import com.fmq.common.service.AdminUsersService;
import com.fmq.common.util.BeanHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author ljg
 *用户
 */
@RestController
public class AdminUsersController extends BaseController{

    @Autowired
    AdminUsersService adminUsersService;

    @RequestMapping("/api/saveAdminUsers")
    public void saveAdminUsers(@Valid @ModelAttribute AdminUsersForm form) {

        AdminUsersDTO adminUsersDTO = new AdminUsersDTO();
        BeanHelper.copyProperties(adminUsersDTO,form);
        adminUsersService.saveAdminUsers(adminUsersDTO);

    }

}
