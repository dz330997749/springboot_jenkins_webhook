package me.xz.dao;

import me.xz.bean.User;
import org.springframework.stereotype.Repository;

/**
 * @Author: XZ
 * @Date: 2020/7/15 0:18
 */
//@Repository 这玩意儿可要可不要
public interface UserDao {

//	查询一个用户 param int id, return User
	User selectOneUserByName(String username);

//	添加一个用户
	void addOneUser(User user);

}
