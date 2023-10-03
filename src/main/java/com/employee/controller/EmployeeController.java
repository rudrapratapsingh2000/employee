package com.employee.controller;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee-app")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/employees")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployees();
    }
    @PostMapping("/employees/id/{id}")
    public Employee getEmployee(@PathVariable Long id){
        return employeeService.getEmployee(id);
    }
    @PostMapping("/employee")
    public String addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }
    @PutMapping("/employee/id/{id}")
    public String updateEmployee(@PathVariable Long id, @RequestBody Employee employee){
        return employeeService.updateEmployee(id,employee);
    }
    @DeleteMapping("/employee/id{id}")
    public String deleteEmployee(@PathVariable Long id){
        return employeeService.deleteEmployee(id);
    }
}
