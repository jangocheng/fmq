package com.fmq.common.service;

import com.fmq.common.dto.AdminUsersDTO;

/**
 *
 * @author ljg
 *
 */
public interface AdminUsersService {
	void updateAdminUsers(AdminUsersDTO adminUsersDTO);

	void saveAdminUsers(AdminUsersDTO adminUsersDTO);

	AdminUsersDTO getByUserUame(String userName);
}
