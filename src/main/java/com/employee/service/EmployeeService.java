package com.employee.service;

import com.employee.model.Employee;
import com.employee.repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepo iEmployeeRepo;

    public List<Employee> getAllEmployees() {
        return iEmployeeRepo.findAll();
    }

    public Employee getEmployee(Long id) {
        return iEmployeeRepo.findById(id).get();
    }

    public String addEmployee(Employee employee) {
        iEmployeeRepo.save(employee);
        return "Employee added Successfully";
    }

    public String updateEmployee(Long id, Employee employee) {
        Employee employee1=iEmployeeRepo.findById(id).get();
        employee1.setAddress(employee.getAddress());
        employee1.setFirstName(employee.getFirstName());
        employee1.setLastName(employee.getLastName());
        iEmployeeRepo.save(employee1);
        return "Employee Record Updated Successfully";
    }

    public String deleteEmployee(Long id) {
        iEmployeeRepo.deleteById(id);
        return "Employee Deleted Successfully";
    }
}
