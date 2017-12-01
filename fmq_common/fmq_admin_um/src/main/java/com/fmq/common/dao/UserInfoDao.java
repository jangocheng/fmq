package com.fmq.common.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.fmq.common.dto.UserDTO;

/**
 *  DAO 接口类
 *
 */
@Mapper
public interface UserInfoDao {

    /**
     *
     * @param userName
     */
    UserDTO findByName(@Param("userName") String userName);
    
    
}
