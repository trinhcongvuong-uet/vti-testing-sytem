package com.vti.program;

import java.sql.SQLException;

import com.vti.entities.Department;
import com.vti.repositories.DepartmentExampleRepository;
import com.vti.repositories.DepartmentRepository;

public class Program {
	public static void main(String[] args) throws SQLException {
		DepartmentExampleRepository repository = new DepartmentExampleRepository();
		
		Department department =  repository.getById(1);
		System.out.println(department.getDepartmentId());
		System.out.println(department.getDepartmentName());
		
		department.setDepartmentId(10);
		repository.insert(department);
		
		
		
//		for (Department departmentItem : repository.searchAll()) {
//			System.out.println(departmentItem.getDepartmentId());
//			System.out.println(departmentItem.getDepartmentName());
//			System.out.println("---------");
//		}
	}
}
