package com.jsp.Controller;

import java.util.Scanner;

import com.jsp.DTO.Employee;
import com.jsp.dao.EmployeeDao;

public class EmployeeDriver 
{
	public static void main(String[] args) throws Exception 
	{ 
		Scanner s=new Scanner(System.in);
		System.out.println("Enter id, Name and Salary");
		int id =s.nextInt();
		String name=s.next();
		int salary=s.nextInt();
		
		Employee e1=new Employee();
		e1.setId(id);
		e1.setName(name);
		e1.setSalary(salary);
		
		EmployeeDao dao=new EmployeeDao();
		//dao.insertEmployee(e1);
        //dao.updateEmployee(e1);
        //dao.deleteEmployee(e1);
		//dao.selectEmployee(e1);
		dao.showIdEmployee(20,"vishalrai");
		
		
		
		
	}

}
