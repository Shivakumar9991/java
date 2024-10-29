package com.xworkz.employeedto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString


public class EmployeeDto {
    private int employeeId;
    private String employeeName;
    private double employeeSalary;
    private  String employeeDepartment;
    private String employeeBloodGroup;

}
