package com.bridgelabz.employeepayroll.model;


import com.bridgelabz.employeepayroll.dto.EmployeeDTO;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import javax.validation.Valid;
import java.time.LocalDateTime;

@Entity
@Table(name = "Employee")
@Data
public class EmployeeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeId;
    private String firstName;
    private String lastName;
    private  String companyName;
    private  long salary;
    private  String department;
    private LocalDateTime registeredDate;
    private LocalDateTime updateDate;
    private  String emailId;
    private  String password;


    public EmployeeModel(EmployeeDTO employeeDTO){

        this.firstName=employeeDTO.getFirstName();
        this.lastName=employeeDTO.getLastName();
        this.companyName=employeeDTO.getCompanyName();
        this.salary=employeeDTO.getSalary();
        this.department=employeeDTO.getDepartment();
        this.emailId=employeeDTO.getEmailId();
        this.password=employeeDTO.getPassword();

    }



    public EmployeeModel() {

    }
}
