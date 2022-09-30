package com.bridgelabz.employeepayroll.service;

import com.bridgelabz.employeepayroll.Util.Response;
import com.bridgelabz.employeepayroll.dto.EmployeeDTO;
import com.bridgelabz.employeepayroll.model.EmployeeModel;

import java.util.List;


public interface IEmployeeService {
    EmployeeModel addemployee(EmployeeDTO employeeDTO);

    EmployeeModel updateemployee(long id, EmployeeDTO employeeDTO);

    List<EmployeeModel> getEmpData(String token);

    EmployeeModel deleteEmployee(Long id);

    Response login(String email, String password);

}
