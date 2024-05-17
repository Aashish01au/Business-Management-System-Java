package com.spring.SpringProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.SpringProject.Model.Department;
import com.spring.SpringProject.Service.DepartmentService;

@Controller
public class DepartmentForm {

	@Autowired
	private DepartmentService deptService;
	
	@GetMapping("/department")
	public String getDepart() {
		return "DepartmentForm";
	}
	
	@PostMapping("/department")
	public String postDepart(@ModelAttribute Department dept) {
		
		deptService.addDept(dept);
		return "DepartmentForm";
	}
	
	@GetMapping("/deptList")
	public String deptList(Model model) {
		
		model.addAttribute("dList",deptService.getAllDepts());
		
		return "DepartmentList";
	}
	
	@GetMapping("/dept/delete")
	public String delete(@RequestParam int id) {
		
		deptService.deleteDept(id);
		return "redirect:/deptList";
	}
	
	@GetMapping("/dept/edit")
	public String edit(@RequestParam int id, Model model) {
		
		model.addAttribute("dModel", deptService.getDeptById(id));
		return "DepartmentEditForm";
	}
	
	@PostMapping("/dept/update")
	public String update(@ModelAttribute Department dept) {
		
		deptService.updateDept(dept);
		return "redirect:/deptList";
	}
	
	
	
	
	
	
}
