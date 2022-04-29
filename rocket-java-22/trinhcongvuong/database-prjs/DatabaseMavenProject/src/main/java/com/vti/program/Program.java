package com.vti.program;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.vti.entities.Department;
import com.vti.repositories.DepartmentExampleRepository;

public class Program {
	public static void main(String[] args) throws SQLException {
		DepartmentExampleRepository repository = new DepartmentExampleRepository();

		Department department1 = new Department(1, "Dev10");
		Department department2 = new Department(1, "Dev11");
		List<Department> departments = new ArrayList<Department>();
		departments.add(department1);
		departments.add(department2);
		

		repository.insertAll(departments);
		
		
		
		Map<Integer, String> studentNameMap = new HashMap<>();
		studentNameMap.put(1, "Trịnh Công Vượng");
		studentNameMap.put(2, "Trịnh Công Danh");
		
		String name = studentNameMap.get(1);
		
		studentNameMap.remove(1);
		studentNameMap.remove(1, "Trịnh Công Vượng");
		studentNameMap.replace(1, "Trịnh Công Vượng 2");
		studentNameMap.replace(1, "Trịnh Công Vượng", "Trịnh Công Vượng 2");
	}
}
