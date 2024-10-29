package com.xworkz;

import com.xworkz.employeedto.EmployeeDto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeRunner {
    public static void main(String[] args) {

        List<EmployeeDto> employeeDtos = new ArrayList<>();

        EmployeeDto dto = new EmployeeDto(1432,"Akash",20000.00,"Quality","A+");
        EmployeeDto dto1 =  new EmployeeDto(1423,"Abhishek",22000,"Production","A-");
        EmployeeDto dto2 = new EmployeeDto(1565,"Bhimashankar",24500.00,"clerk","O+");
        EmployeeDto dto3 = new EmployeeDto(1566,"Shivakumar",40000.00,"R&D","AB-");
        EmployeeDto dto4 = new EmployeeDto(1575,"Channaveer CH",25000.00,"Marketing","O-");
        EmployeeDto dto5 = new EmployeeDto(1465,"Channaveer M",35000.00,"Sales","A+");
        EmployeeDto dto6 = new EmployeeDto(1589,"Prasad",20000.00,"clerk","B-");
        EmployeeDto dto7 = new EmployeeDto(1576,"Sampath",45000.00,"Marketing","O-");
        EmployeeDto dto8 = new EmployeeDto(1587,"Shashi",22000.00,"Salesmen","O+");
        EmployeeDto dto9 = new EmployeeDto(1765,"Uday",50000.00,"Manager","AB+");
        EmployeeDto dto10 = new EmployeeDto(1987,"Akash",45000.00,"Audit","A-");
        EmployeeDto dto11 = new EmployeeDto(1654,"Suresh",75000.00,"HR","B+");
        EmployeeDto dto12 = new EmployeeDto(1876,"Shreeshail",18000.00,"clerk","B+");
        EmployeeDto dto13 = new EmployeeDto(1435,"Akash",19000.00,"clerk","A-");
         employeeDtos.add(dto);
         employeeDtos.add(dto1);
         employeeDtos.add(dto2);
         employeeDtos.add(dto3);
         employeeDtos.add(dto4);
         employeeDtos.add(dto5);
         employeeDtos.add(dto6);
         employeeDtos.add(dto7);
         employeeDtos.add(dto8);
         employeeDtos.add(dto9);
         employeeDtos.add(dto10);
         employeeDtos.add(dto11);
         employeeDtos.add(dto12);
         employeeDtos.add(dto13);


//         1.employee second highest salary
//        System.out.println(employeeDtos.stream().sorted(Comparator.comparing(EmployeeDto::getEmployeeSalary).reversed()).skip(1).findFirst());

//         2.employee salary more then 25000
           System.out.println(employeeDtos.stream().filter(salary -> salary.getEmployeeSalary() > 25000.00).collect(Collectors.toList()));

//        3. employee name start with any character
        System.out.println(employeeDtos.stream().filter(ref -> ref.getEmployeeName().startsWith("S")).collect(Collectors.toList()));

//        4.find employee duplicate name
 //      System.out.println(employeeDtos.stream().filter(name -> name.getEmployeeName()));



//        for(EmployeeDto ttt : employeeDtos)
//            System.out.println(ttt);

    }
}
