package com.bridgelabz.employeepayroll.controller;


import com.bridgelabz.employeepayroll.Util.Response;
import com.bridgelabz.employeepayroll.dto.EmployeeDTO;
import com.bridgelabz.employeepayroll.model.EmployeeModel;
import com.bridgelabz.employeepayroll.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employeepayroll")
public class EmployeeController {
@Autowired
    IEmployeeService employeeService;

    @PostMapping("/addemployee")
    public EmployeeModel addEmployeeModel(@RequestBody EmployeeDTO employeeDTO){

        return employeeService.addemployee(employeeDTO);
    }
    @PutMapping("/updateemployee/{id}")
    public EmployeeModel updateemployee(@RequestBody EmployeeDTO employeeDTO,@PathVariable long id){
        return employeeService.updateemployee(id,employeeDTO);
    }
    @GetMapping("/getEmployeedata")
    public List<EmployeeModel> getallemployee(@RequestHeader String token){
        return employeeService.getEmpData(token);
    }

    @DeleteMapping("deleteemployee/{id}")
    public EmployeeModel deleteemployee(@PathVariable Long id){
        return employeeService.deleteEmployee(id);
    }

    @PostMapping("login")
    public Response login(@RequestParam String email,@RequestParam String password){
        return employeeService.login(email,password);
    }
}
