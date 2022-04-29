package com.vti.repositories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
		// connect to database
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

	public Department getById2(long id) throws SQLException {
		// connect to database
		Connection connection = getConnect();

		String query = "select department_id, department_name from department where department_id = ?";
		PreparedStatement statement = connection.prepareStatement(query);
		statement.setLong(1, id);
		System.out.println(query);
		ResultSet resultSet = statement.executeQuery();
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
		// connect to database
		Connection connection = getConnect();

		Statement statement = connection.createStatement();
		String sql = "insert into department(department_id, department_name) values(" + department.getDepartmentId()
				+ ", '" + department.getDepartmentName() + "')";
		System.out.println(sql);

		int count = statement.executeUpdate(sql);

		return count;
	}

	public int insert2(Department department) throws SQLException {
		// connect to database
		Connection connection = getConnect();

		String sql = "insert into department(department_id, department_name) values(?, ?)";

		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setLong(1, department.getDepartmentId());
		statement.setString(2, department.getDepartmentName());
		System.out.println(sql);

		int count = statement.executeUpdate();

		return count;
	}

	public int insert(List<Department> departments) throws SQLException {
		// connect to database
		Connection connection = getConnect();

		Statement statement = connection.createStatement();
		String sql = "insert into department(department_id, department_name) values";

		List<String> values = new ArrayList<String>();
		for (Department department : departments) {
			StringBuilder value = new StringBuilder();
			// values(x1, y1),(x2,y2)
			value.append("(").append(department.getDepartmentId()).append(", '").append(department.getDepartmentName())
					.append("')");
			values.add(value.toString());
		}
		String valueFinal = String.join(",", values);
		sql += valueFinal;
		System.out.println(sql);

		int count = statement.executeUpdate(sql);

		return count;
	}

	public int insertAll(List<Department> departments) throws SQLException {
		// connect to database
		Connection connection = getConnect();

		connection.setAutoCommit(false);
		int count = 0;
		try {
			for (Department department : departments) {

				String sql = "insert into department(department_id, department_name) values(?, ?)";

				PreparedStatement statement = connection.prepareStatement(sql);
				statement.setLong(1, department.getDepartmentId());
				statement.setString(2, department.getDepartmentName());

				count += statement.executeUpdate();
			}

			connection.commit();
		} catch (Exception e) {
			connection.rollback();
			count = 0;
			System.out.println(e.getMessage());
		}

		connection.setAutoCommit(true);
		connection.close();
		return count;
	}

	public int insert2(List<Department> departments) throws SQLException {
		// connect to database
		Connection connection = getConnect();

		String sql = "insert into department(department_id, department_name) values";
		List<String> values = new ArrayList<String>();
		for (int i = 0; i < departments.size(); i++) {
			values.add("(?, ?)");
		}

		sql += String.join(",", values);
		System.out.println(sql);

		PreparedStatement statement = connection.prepareStatement(sql);
		for (int i = 0; i < departments.size(); i++) {
			statement.setLong(i * 3 + 1, departments.get(i).getDepartmentId());
			statement.setString(i * 3 + 2, departments.get(i).getDepartmentName());
		}

		int count = statement.executeUpdate();

		return count;
	}

	public int update(Department department) throws SQLException {
		// connect to database
		Connection connection = getConnect();

		Statement statement = connection.createStatement();

		Department departmentOld = getById(department.getDepartmentId());
		if (departmentOld == null) {
			System.out.println("Datano found");
			return 0;
		}

		String sql = "update department set department_name = '" + department.getDepartmentName()
				+ "' where department_id = " + department.getDepartmentId();
		System.out.println(sql);

		int count = statement.executeUpdate(sql);

		return count;
	}

	public int updateByProcedure(Department department) throws SQLException {
		// connect to database
		Connection connection = getConnect();

		String sql = "call update_department(?, ?)";
		System.out.println(sql);

		CallableStatement callableStatement = connection.prepareCall(sql);
		callableStatement.setLong(1, department.getDepartmentId());
		callableStatement.setString(2, department.getDepartmentName());

		int count = callableStatement.executeUpdate();

		return count;
	}

	public int deleteById(long id) throws SQLException {
		// connect to database
		Connection connection = getConnect();

		Statement statement = connection.createStatement();
		String query = "delete from department where department_id = " + id;

		int count = statement.executeUpdate(query);

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
