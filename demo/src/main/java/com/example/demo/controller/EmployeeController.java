package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@CrossOrigin(origins = "http://localhost:4200/") 
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	//get all employees
	@GetMapping("/employees")
	public List<Employee>getallEmployees(){
		return employeeRepository.findAll();
	}
	
	//create employee rest api
    @PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee employee){
		return employeeRepository.save(employee);

	}

	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id){
	  Employee employee = employeeRepository.findById(id).orElseThrow();
	  return ResponseEntity.ok(employee);

	}
  
  //update employee rest api
  @PutMapping("/employees/{id}")
  public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails){
	  Employee employee = employeeRepository.findById(id)
			  .orElseThrow();
	  employee.setFirstname(employeeDetails.getFirstname());
	  employee.setLastname(employeeDetails.getLastname());
	  employee.setsapid(employeeDetails.getsapid());
	  employee.setemailid(employeeDetails.getemailid());
	  employee.setmedicalhis(employeeDetails.getmedicalhis());
	  employee.setprescription(employeeDetails.getprescription());
	  
	  
	  Employee updatedEmployee = employeeRepository.save(employee);
	  return ResponseEntity.ok(updatedEmployee);
	  


}
}