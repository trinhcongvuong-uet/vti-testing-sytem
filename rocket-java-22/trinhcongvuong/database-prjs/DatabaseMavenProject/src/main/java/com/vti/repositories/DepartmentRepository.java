package com.vti.repositories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.vti.entities.Department;

public class DepartmentRepository extends CommonRepository<Department> {

	public int insert(Department entity) throws SQLException {
		String sql = "insert into `department`(`department_name`, `department_id`) values( ?, ?)";
		return this.executeUpdate(sql, entity);
	}

	public int update(Department entity) throws SQLException {
		String sql = "update `department` " + "set `department_name` = ? " + "where `department_id` = ?";
		return this.executeUpdate(sql, entity);
	}

	public int delelte(long id) throws SQLException {
		String sql = "delete department where department_id = " + id;
		return this.executeUpdate(sql);
	}

	public Department getById(long id) throws SQLException {
		String sql = "select * from department where department_id = " + id;
		List<Department> departments = this.executeQuery(sql);
		return departments.isEmpty() ? null : departments.get(0);
	}

	public List<Department> search(Map<String, ?> conditionMap) {
		// TODO Auto-generated method stub
		return null;
	}

	public long getMaxId() throws SQLException {
		return this.getMaxId("department", "department_id");
	}

	@Override
	public int executeUpdate(PreparedStatement preparedStatement, Department entity) throws SQLException {
		preparedStatement.setString(1, entity.getDepartmentName());
		preparedStatement.setLong(2, entity.getDepartmentId());
		return preparedStatement.executeUpdate();
	}

	@Override
	public List<Department> getDataTable(ResultSet resultSet) throws SQLException {
		List<Department> departments = new ArrayList<Department>();
		while (resultSet.next()) {
			long departmentId = resultSet.getLong("department_id");
			String departmentName = resultSet.getString("department_name");
			Department department = new Department(departmentId, departmentName);

			departments.add(department);
		}
		return departments;
	}

}
