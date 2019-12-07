package com.luv2code.cruddemo.rest;

import com.luv2code.cruddemo.dao.EmployeeDAO;
import com.luv2code.cruddemo.entity.Employee;
import com.luv2code.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeService employeeService;

    @Autowired
    public  EmployeeRestController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

    @GetMapping("/employee/{employeeId}")
    public Employee findById(@PathVariable int employeeId){
        Employee employee = employeeService.findById(employeeId);
        if( employee == null ) {
            throw new RuntimeException("Employee did not found " + employeeId);
        }
        return employee;
    }

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee){
        employee.setId(0);
        Employee theEmployee = employeeService.save(employee);
        return theEmployee;
    }

    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee employee){
//        Employee employeeForCheck = employeeService.findById(employee.getId());
//        if(employeeForCheck==null){
//            return null;
//        }

        Employee theEmployee = employeeService.save(employee);
        return theEmployee;
    }

    @DeleteMapping("/employee/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId){
        Employee employeeForCheck = employeeService.findById(employeeId);
        if(employeeForCheck==null){
            throw new RuntimeException("Employee id not found " + employeeId);
        }
        employeeService.deleteById(employeeId);
        return "Delete Employee by ID " + employeeId;
    }
}
