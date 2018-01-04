package com.fmq.common.service.impl;

import com.fmq.common.base.BaseService;
import com.fmq.common.dao.AdminUsersDao;
import com.fmq.common.dto.AdminUsersDTO;
import com.fmq.common.service.AdminUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ljg
 *
 */
@Service
public class AdminUsersServiceImpl extends BaseService implements AdminUsersService {

    @Autowired
    AdminUsersDao dao;
    @Override
    public void saveAdminUsers(AdminUsersDTO adminUsersDTO) {
        dao.saveUser(adminUsersDTO);
    }
}
