package me.xz.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import me.xz.bean.Employee;
import me.xz.service.EmpService;
import me.xz.utils.JsonMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: XZ
 * @Date: 2020/7/15 23:23
 * 操作员工的接口
 */



@RestController
@RequestMapping("/emp")
public class EmpController {

	@Autowired
	private EmpService empService;

//	修改员工
	@PostMapping("/updateEmp")
	public JsonMsg updateEmp(@RequestBody Employee emp) {
		System.out.println(emp);
		int result = empService.updateEmp(emp);
		if (result>0) {
			return JsonMsg.success();
		} else {
			return JsonMsg.fail();
		}
	}

//	通过id查询单个员工
	@GetMapping("/selectOneEmpById")
	public JsonMsg selectOneEmpById(int id) {
		Employee employee = empService.selectOneEmpById(id);
		if (employee!=null) {
			return JsonMsg.success().addInfo("edit_emp", employee);
		} else {
			return JsonMsg.fail();
		}
	}

//	删除一名员工
	@GetMapping("/deleteEmpById")
	public JsonMsg deleteEmpById(int id) {
		int result = empService.deleteEmpById(id);
		if (result>0) {
			return JsonMsg.success();
		} else {
			return JsonMsg.fail();
		}
	}

//	添加一条员工信息
	@PostMapping("/addEmp")
	public JsonMsg addOneEmp(@RequestBody Employee employee) {
		System.out.println("controller接收到的数据为"+employee);
		int result = empService.addOneEmp(employee);
		if ( result==0 ) {
			return JsonMsg.fail();
		} else {
			return JsonMsg.success();
		}

	}


//	查询全部带有部门信息的员工集合 没有分页
//	@RequestMapping("/selectAllEmp")
//	public JsonMsg selectAllEmps() {
//		List<Employee> empList = empService.selectAllEmpsWithDept();
//		System.out.println(empList);
//
//		return JsonMsg.success().addInfo("emps", empList);
//
//	}


//	重新写一个分页查询的全部员工
	@GetMapping("/selectAllEmpByPage")
	public JsonMsg selectAllByPage(@RequestParam(value = "page",defaultValue = "1") Integer currentPage ) {

		System.out.println("当前page是   ："+currentPage);
//		currentPage为当前页码，pageSize为每一页多少条数据
		PageHelper.startPage(currentPage, 6);
//		查询全部员工
		List<Employee> empList = empService.selectAllEmpsWithDept();
//		传入查询的集合，navigatePages为导航页数码
		PageInfo pageInfo = new PageInfo(empList, 5);
//		返回前台查询的结果
		return JsonMsg.success().addInfo("empsPageInfo", pageInfo);
	}

}




































