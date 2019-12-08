package com.luv2code.cruddemo.service;

import com.luv2code.cruddemo.dao.EmployeeDAO;
import com.luv2code.cruddemo.dao.EmployeeRepository;
import com.luv2code.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return this.employeeRepository .findAll();
    }

    @Override
    public Employee findById(int theId) {
        Optional<Employee> employeeOptional = this.employeeRepository.findById(theId);
        return employeeOptional.isPresent() ? employeeOptional.get() : null;
    }

    @Override
    public Employee save(Employee theEmployee) {
        this.employeeRepository.save(theEmployee);
        return theEmployee;
    }

    @Override
    public void deleteById(int theId) {
        this.employeeRepository.deleteById(theId);
    }

//    private EmployeeDAO employeeDAO;
//
//    @Autowired
//    public EmployeeServiceImpl(@Qualifier("employeeDAOJpaImpl") EmployeeDAO theEmployeeDao){
//        this.employeeDAO = theEmployeeDao;
//    }
//
//    @Override
//    @Transactional
//    public List<Employee> findAll() {
//        return employeeDAO.findAll();
//    }
//
//    @Override
//    @Transactional
//    public Employee findById(int theId) {
//        return employeeDAO.findById(theId);
//    }
//
//    @Override
//    @Transactional
//    public Employee save(Employee theEmployee) {
//        return employeeDAO.save(theEmployee);
//    }
//
//    @Override
//    @Transactional
//    public void deleteById(int theId) {
//        employeeDAO.deleteById(theId);
//    }
}
