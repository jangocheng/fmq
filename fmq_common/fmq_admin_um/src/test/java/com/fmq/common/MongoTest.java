package com.fmq.common;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

import com.fmq.common.base.BaseTest;
import com.fmq.common.dao.UserInfoMongoDAO;
import com.fmq.common.dto.UserInfoDTO;
/**
 * 参考 文章
 * https://www.cnblogs.com/ityouknow/p/6828919.html
 * @author ljg
 *
 */
@SpringBootTest(classes = StartApplication.class)
@WebAppConfiguration
public class MongoTest extends BaseTest {

	@Autowired
	private UserInfoMongoDAO userDao;

	@Test
	public void testSaveUser() throws Exception {
		UserInfoDTO user = new UserInfoDTO();
		user.setId("1");
		user.setUserName("小明");
		user.setPassWord("fffooo123");
		user.setIdCard("123456789");
		user.setMobilePhone("13838384438");
		
		userDao.saveUser(user);
	}

	@Test
	public void findUserByUserName() {
		UserInfoDTO user = userDao.findUserByUserName("小明");
		System.out.println("user is " + user);
	}

	@Test
	public void updateUser() {
		UserInfoDTO user = new UserInfoDTO();
		user.setId("1");
		user.setUserName("天空");
		user.setPassWord("fffxxxx");
		userDao.updateUser(user);
	}

	@Test
	public void deleteUserById() {
		userDao.deleteUserById("1");
	}

}
