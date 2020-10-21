package me.xz.dao;

import me.xz.bean.Department;

import java.util.List;

/**
 * @Author: XZ
 * @Date: 2020/7/16 15:20
 */
public interface DeptDao {

//	查询全部部门信息
	List<Department> selectAllDept();

}
