package com.spring.SpringProject.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.SpringProject.Model.Employee;
import com.spring.SpringProject.Service.DepartmentService;
import com.spring.SpringProject.Service.EmployeeService;
import com.spring.SpringProject.Utils.EmployeeExcelView;
import com.spring.SpringProject.Utils.EmployeePdfView;

@Controller
public class EmployeeController {
	
	private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeService empService;
	
	@Autowired
	private DepartmentService deptService;
	
	@GetMapping("/employee")
	public String getEmployee(Model model) {
		model.addAttribute("dList",deptService.getAllDepts());
		return "EmployeeForm";
	}

	@PostMapping("/employee")
	public String postEmployee(@ModelAttribute Employee emp) {
		empService.addEmp(emp);
		return "redirect:/employee";
	}
	
	@GetMapping("/empList")
	public String getEmps(Model model ) {
		model.addAttribute("eList", empService.getAllEmps());
	return "EmployeeList";	
		
	}
	
	@GetMapping("/emp/delete")
	public String delete(@RequestParam int id) {
		
		empService.deleteEmp(id);
		return "redirect:/empList";
	}
	@GetMapping("/emp/edit")
	public String edit(@RequestParam int id, Model model) {
		model.addAttribute("eModel", empService.getEmpByIdEmployee(id));
		System.out.println(empService.getEmpByIdEmployee(id));
		model.addAttribute("dList", deptService.getAllDepts());
		return"EmployeeEditForm";
	}
	@PostMapping("/emp/update")
	public String update(@ModelAttribute Employee emp) {
		
		empService.updateEmployee(emp);
		return "redirect:/empList";
	}
	
	@GetMapping("/emp/excel")
	public String getExxcel() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("exllist",empService.getAllEmps());
		mv.setView(new EmployeeExcelView());
		log.info("-----------------excel list----------------");
		return"mv";
	}
	@GetMapping("/emp/pdf")
	public String getPost() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("pdflist",empService.getAllEmps());
		mv.setView(new EmployeePdfView());
		
		log.info("--------------pdf view--------------");
		return"mv";
	}
	
}
