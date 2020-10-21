package me.xz.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: XZ
 * @Date: 2020/7/15 23:27
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	private Integer id;
	private String name;
	private Integer age;
	private String gender;
	private Double salary;
	private Integer dept_id;

//	部门类
	private Department department;

}






















