package me.xz.controller;

import me.xz.bean.User;
import me.xz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: XZ
 * @Date: 2020/7/14 21:01
 */

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

//	用户注册
	@PostMapping("/register")
	public Map<String, Object> register(@RequestBody User user) {
		Map<String, Object> map = new HashMap<>();
		try {
			//注册参数正常接收，首先查看数据库里是否存在用户名
			User dbUser = userService.selectOneUserByName(user.getUsername());
			if(dbUser==null) {
				userService.addOneUser(user);
				map.put("message", "注册成功");
				map.put("status", 100);
			} else {
//			数据库存在该用户
				throw new RuntimeException("该用户名已经存在！");
			}
		} catch (Exception e) {
			e.printStackTrace();
			map.put("message", "注册失败,"+e.getMessage());
			map.put("status", 200);
		}
		return map;
	}


//	用户登陆
	@PostMapping("/login")
	public Map<String, Object> login(@RequestBody User user) {
		Map<String, Object> map = new HashMap<>();

		System.out.println(user);

		User dbUser = userService.selectOneUserByName(user.getUsername());
//		查询接收到的user的用户名和密码是否和数据库的匹配
		if( dbUser==null ) {
//			此时数据库中没有对应的用户
			map.put("status", 200);
			map.put("message", "登陆失败，用户名不存在！");
		} else {
//			数据库有用户 对比密码
			if(user.getPassword().equals(dbUser.getPassword())) {
				map.put("status", 100);
				map.put("message", "登陆成功");
//				将登陆成功的user对象返回前台
				map.put("loginUser", dbUser);
			} else {
				map.put("status", 200);
				map.put("message", "登陆失败，密码错误！");
			}
		}
		return map;
	}

}

















