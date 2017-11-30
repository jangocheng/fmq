package com.fmq.common.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import com.fmq.common.base.BaseMongoDao;
import com.fmq.common.dao.UserInfoMongoDAO;
import com.fmq.common.dto.UserInfoDTO;

@Component
public class UserInfoMongoDAOImpl extends BaseMongoDao implements UserInfoMongoDAO {
	@Autowired
	private MongoTemplate mongoTemplate;

	/**
	 * 创建对象
	 * 
	 * @param user
	 */
	@Override
	public void saveUser(UserInfoDTO user) {
		mongoTemplate.save(user);
	}

	/**
	 * 根据用户名查询对象
	 * 
	 * @param userName
	 * @return
	 */
	@Override
	public UserInfoDTO findUserByUserName(String userName) {
		Query query = new Query(Criteria.where("userName").is(userName));
		UserInfoDTO user = mongoTemplate.findOne(query, UserInfoDTO.class);
		return user;
	}

	/**
	 * 更新对象
	 * 
	 * @param user
	 */
	@Override
	public void updateUser(UserInfoDTO user) {
		Query query = new Query(Criteria.where("id").is(user.getId()));
		Update update = new Update().set("userName", user.getUserName()).set("passWord", user.getPassWord());
		// 更新查询返回结果集的第一条
		mongoTemplate.updateFirst(query, update, UserInfoDTO.class);
		// 更新查询返回结果集的所有
		// mongoTemplate.updateMulti(query,update,UserInfoDTO.class);
	}

	/**
	 * 删除对象
	 * 
	 * @param id
	 */
	@Override
	public void deleteUserById(String id) {
		Query query = new Query(Criteria.where("id").is(id));
		mongoTemplate.remove(query, UserInfoDTO.class);
	}
}