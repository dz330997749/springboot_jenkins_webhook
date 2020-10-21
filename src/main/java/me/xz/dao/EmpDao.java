package me.xz.dao;

import me.xz.bean.Employee;

import java.util.List;

/**
 * @Author: XZ
 * @Date: 2020/7/15 23:26
 */


public interface EmpDao {

//	查询全部带部门的员工集合
	List<Employee> selectAllEmpsWithDept();

//	添加一个员工数据 添加的参数有Employee类不包括Department的全部数据 和dept_id
//	sql语句： Insert into tbl_emp values ( null, 'name', 'age', 'gender', 'salary', 'dept_id' );
	int addOneEmp(Employee employee);

//	删除一名员工
	int deleteEmpById(int id);

//	查询一个带部门信息的员工
	Employee selectOneEmpById(int id);

//	修改员工信息
	int updateEmp(Employee emp);

}



















