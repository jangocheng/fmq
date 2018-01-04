package com.fmq.common.dao;
/**
 * DAO 接口类
 *
 * @author ljg
 *
 */

import com.fmq.common.dto.AdminUsersDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminUsersDao {

    /**
     * 新增
     *
     * @param adminUsersDTO
     * @return
     */
    int saveUser(AdminUsersDTO adminUsersDTO);


}
