package com.vti.repositories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.vti.entities.Department;

// Select, insert, update, delete table department
public class DepartmentExampleRepository {

	public Department getById(long id) throws SQLException {
		//
		Connection connection = getConnect();

		Statement statement = connection.createStatement();
		String query = "select department_id, department_name from department where department_id = " + id;
		System.out.println(query);
		ResultSet resultSet = statement.executeQuery(query);
		Department department = null;
		if (resultSet.next()) {
			department = new Department();
			long departmentId = resultSet.getLong("department_id");
			String departmentName = resultSet.getString("department_name");

			department.setDepartmentId(departmentId);
			department.setDepartmentName(departmentName);

		}

		return department;
	}

	public int insert(Department department) throws SQLException {
		Connection connection = getConnect();
		Statement statement = connection.createStatement();
		String sql = "insert into department(department_id, department_name) values(" + department.getDepartmentId()
				+ ", '" + department.getDepartmentName() + "')";
		System.out.println(sql);

		int count = statement.executeUpdate(sql);

		return count;
	}

	public List<Department> searchAll() throws SQLException {
		//
		Connection connection = getConnect();

		String query = "select department_id, department_name from department";
		System.out.println(query);
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query);
		List<Department> departments = new ArrayList<Department>();
		while (resultSet.next()) {
			Department department = new Department();
			long departmentId = resultSet.getLong("department_id");
			String departmentName = resultSet.getString("department_name");

			department.setDepartmentId(departmentId);
			department.setDepartmentName(departmentName);

			departments.add(department);

		}

		return departments;
	}

	private Connection getConnect() {
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("src/main/resource/database.properties"));
			String url = properties.getProperty("url");
			String userName = properties.getProperty("username");
			String password = properties.getProperty("password");
			Class.forName("com.mysql.cj.jdbc.Driver");

			return DriverManager.getConnection(url, userName, password);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return null;
	}

}
