package com.jsgrewal.springbackend;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    private EmployeeRepository empRepo;
    @Autowired
    private DepartmentsRepository deptRepo;

    @GetMapping("/getRequiredDetails")
    public List<EmpDeptDto> sendRequiredDetails() {
        List<EmpDeptDto> requiredList = new ArrayList<>();
        List<Employee> allEmployees = empRepo.findAll();
        
        allEmployees.stream().forEach(employee -> {
            Department relatedDept = deptRepo.findById(employee.getDeptno()).get();
            requiredList.add(
                    new EmpDeptDto(employee.getEmpno(), employee.getName(), employee.getJob(), relatedDept.getName()));

        });

        return requiredList;

    }
}
