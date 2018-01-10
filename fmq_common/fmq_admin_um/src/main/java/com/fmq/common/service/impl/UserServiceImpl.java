package com.fmq.common.service.impl;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import com.fmq.common.base.BaseService;
import com.fmq.common.dao.UserInfoDao;
import com.fmq.common.dto.UserDTO;
import com.fmq.common.service.UserService;

/**
 * * 业务逻辑实现类
 * 
 * @author ljg
 *
 */
@Service
public class UserServiceImpl extends BaseService implements UserService {

	@Autowired
	private UserInfoDao dao;

	@SuppressWarnings("rawtypes")
	@Autowired
	private RedisTemplate redisTemplate;

	@Override
	public UserDTO getByUserName(String userName) {
		// 从 DB 中获取用户信息
		UserDTO dto = dao.getByUserName(userName);
		return dto;
	}
	@Override
	public UserDTO findUerById(String id) {

		// 从缓存中获取用户信息

		// 以下是使用redis 部分
		String key = "User_" + id;
		ValueOperations<String, UserDTO> operations = redisTemplate.opsForValue();

		// 缓存存在
		boolean hasKey = redisTemplate.hasKey(key);
		if (hasKey) {
			UserDTO dto = operations.get(key);
			logger.info("UserServiceImpl.findUerById() : 从缓存中获取了 >> " + dto.toString());
			return dto;
		}

		// 从 DB 中获取用户信息
		UserDTO dto = dao.findById(id);

		// 插入缓存
		operations.set(key, dto, 10, TimeUnit.SECONDS);
		logger.info("UserServiceImpl.findUerByName() : 插入缓存 >> " + dto.toString());

		return dto;
	}

	@Override
	public void deleteUser(String id) {
		dao.deleteUser(id);
	}

	@Override
	public List<UserDTO> findAll() {
		return dao.findAll();
	}

	@Override
	public void saveUser(UserDTO userDto) {
		dao.saveUser(userDto);
	}

	@Override
	public void updateUser(UserDTO userDto) {
		dao.updateUser(userDto);
	}

}
