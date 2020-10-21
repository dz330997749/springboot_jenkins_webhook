package me.xz.service;

import me.xz.bean.Employee;

import java.util.List;

/**
 * @Author: XZ
 * @Date: 2020/7/16 0:34
 */

public interface EmpService {

//	查询全部带部门的员工
	List<Employee> selectAllEmpsWithDept ();

//	添加一个员工
	int addOneEmp(Employee employee);

	//	删除一名员工
	int deleteEmpById(int id);
	
//	通过id查询一个带部门信息的员工
	Employee selectOneEmpById(int id);

	//	修改员工信息
	int updateEmp(Employee emp);

}
