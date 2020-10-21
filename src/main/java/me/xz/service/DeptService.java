package me.xz.service;

import me.xz.bean.Department;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: XZ
 * @Date: 2020/7/16 15:24
 */

public interface DeptService {

//	查询全部部门
	List<Department> selectAllDept();

}
