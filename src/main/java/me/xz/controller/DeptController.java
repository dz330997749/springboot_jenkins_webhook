package me.xz.controller;

import me.xz.bean.Department;
import me.xz.service.DeptService;
import me.xz.utils.JsonMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: XZ
 * @Date: 2020/7/16 15:18
 * 部门相关的接口
 */

@RestController
@RequestMapping("/dept")
public class DeptController {

	@Autowired
	private DeptService deptService;

//	查询全部部门
	@RequestMapping("/selectAllDept")
	public JsonMsg selectAllDept() {

		List<Department> deptList = deptService.selectAllDept();
		if ( deptList.isEmpty() ) {
			return JsonMsg.fail();
		} else {
			return JsonMsg.success().addInfo("depts", deptList);
		}
	}

}










