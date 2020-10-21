package me.xz.service;

import me.xz.bean.Employee;
import me.xz.dao.EmpDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: XZ
 * @Date: 2020/7/16 0:36
 */
@Service
public class EmpServiceImpl implements EmpService{

	@Autowired
	private EmpDao empDao;

	@Override
	public List<Employee> selectAllEmpsWithDept() {
		return empDao.selectAllEmpsWithDept();
	}

	@Override
	public int addOneEmp(Employee employee) {
		return empDao.addOneEmp(employee);
	}

	@Override
	public int deleteEmpById(int id) {
		return empDao.deleteEmpById(id);
	}

	@Override
	public Employee selectOneEmpById(int id) {
		return empDao.selectOneEmpById(id);
	}

	@Override
	public int updateEmp(Employee emp) {
		return empDao.updateEmp(emp);
	}
}
























