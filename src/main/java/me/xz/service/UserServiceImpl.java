package me.xz.service;

import me.xz.bean.User;
import me.xz.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: XZ
 * @Date: 2020/7/15 0:28
 */

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;

	@Override
	public void addOneUser(User user) {
		userDao.addOneUser(user);
	}

	@Override
	public User selectOneUserByName(String username) {
		return userDao.selectOneUserByName(username);
	}
}
