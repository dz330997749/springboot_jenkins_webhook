package me.xz.service;

import me.xz.bean.Department;
import me.xz.dao.DeptDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: XZ
 * @Date: 2020/7/16 15:24
 */
@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptDao deptDao;

	@Override
	public List<Department> selectAllDept() {
		return deptDao.selectAllDept();
	}
}
