package com.vti.entities;

import java.sql.SQLException;

import com.vti.repositories.DepartmentRepository;

public class Department implements Comparable<Department> {
	private static long currentId = 0;

	private long departmentId;

	private String departmentName;

	public Department() throws SQLException {
		setDepartmentId();
	}

	public Department(String departmentName) throws SQLException {
		setDepartmentId();
		this.departmentName = departmentName;
	}

	public Department(long departmentId, String departmentName) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}

	public long getDepartmentId() {
		return departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	private void setDepartmentId() throws SQLException {
		DepartmentRepository departmentRepository = new DepartmentRepository();
		currentId = departmentRepository.getMaxId();
		this.departmentId = ++currentId;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Department)) {
			return false;
		}
		Department department = (Department) obj;
		if (department.getDepartmentId() == this.departmentId
				&& department.getDepartmentName() == this.departmentName) {
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(Department o) {
		if(this.getDepartmentId() > o.getDepartmentId()) {
			return 1;
		} else if(this.getDepartmentId() < o.getDepartmentId()){
			return -1;
		}
		return 0;
	}
}
