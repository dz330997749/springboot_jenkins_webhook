package me.xz.service;

import me.xz.bean.User;

/**
 * @Author: XZ
 * @Date: 2020/7/15 0:26
 */

public interface UserService {
//	根据id查询一个user
	User selectOneUserByName(String username);

//	注册（添加）一个user
	void addOneUser(User user);

}
