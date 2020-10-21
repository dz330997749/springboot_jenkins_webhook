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
public class Department {

	private Integer id;
	private String dept_name;
	private String dept_leader;

}
