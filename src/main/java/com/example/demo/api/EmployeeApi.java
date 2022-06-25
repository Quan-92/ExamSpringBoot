package com.example.demo.api;

import com.example.demo.entity.Employees;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
@CrossOrigin(value = "*", allowedHeaders = "*")
public class EmployeeApi {
    @Autowired
    EmployeeService employeeService;
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Employees>> getList() {
        return ResponseEntity.ok(employeeService.findAll());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Employees> create(@RequestBody Employees employees) {
        return ResponseEntity.ok(employeeService.createEprisee(employees));
    }
}
