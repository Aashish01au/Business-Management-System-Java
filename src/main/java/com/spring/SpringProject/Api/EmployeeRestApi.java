package com.spring.SpringProject.Api;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.spring.SpringProject.Model.Employee;
import com.spring.SpringProject.Model.Products;
import com.spring.SpringProject.Repository.ProductRepository;
import com.spring.SpringProject.Service.EmployeeService;

@RestController
public class EmployeeRestApi {
	@Autowired
	private ProductRepository productsRepo;

	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/api/emp/list")
	public List<Employee> getAll() {
		
		return empService.getAllEmps();
	}
	
	
	@GetMapping("/api/emp/{id}")  // PathVariable=RequestParam /automatically creating variable/string to store data
	public Employee getOne( @PathVariable int id) {
		
		return empService.getEmpByIdEmployee(id);
	}
	
	
	@PostMapping("/api/emp/add") // RequestBody = Model.Atribute/ used to receive the data in controller/Employee from Form 
	public String Add(@RequestBody Employee emp) {
		empService.addEmp(emp); // adding/sending the data to dataBase 
		return"Success";
	}
	

	
	@PutMapping("/api/emp/update")
	public String Update(@RequestBody Employee emp) {
		
		empService.updateEmployee(emp);
		
		return"Update Success";
		
	}
	
	@DeleteMapping("/api/emp/delete/{id}")
	public String Delete(@PathVariable int id) {
		
		empService.deleteEmp(id);
		
		return"Delete Success";
	}
	
	@GetMapping("/api/emp/j2o")
	public String jsonToObject() {
		
		RestTemplate rtmp= new RestTemplate(); //RestTemplate= used to call the Data from URL/link just like scanner is used to call the data from dataBase.
		
	Employee emp=rtmp.getForObject("http://localhost:8080/api/emp/6", Employee.class);
		
		return"First Name ="+ emp.getFname();
		
	}
	@GetMapping("/api/emp/jA2oA")
	public String jsonArrayTOObjArray() {
		
		RestTemplate rtemp= new RestTemplate();
		
	Employee emps[]	=rtemp.getForObject("http://localhost:8080/api/emp/list", Employee[].class);
	
		return"Age ="+emps[1].getAge();
	}
	
	@GetMapping("/api/emp/loadprodcts")
	public String LoadProducts() {
		RestTemplate rtemp= new RestTemplate();
		
	Products[]	p=rtemp.getForObject("https://fakestoreapi.com/products", Products[].class);
	
	productsRepo.saveAll(Arrays.asList(p));
		return" Products Load Success";
	}
	
}
