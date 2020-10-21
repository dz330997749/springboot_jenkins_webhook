package me.xz.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: XZ
 * @Date: 2020/7/14 20:55
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
//用户数据实体类：id,username，password
public class User {

	private Integer id;
	private String username;
	private String password;

}
