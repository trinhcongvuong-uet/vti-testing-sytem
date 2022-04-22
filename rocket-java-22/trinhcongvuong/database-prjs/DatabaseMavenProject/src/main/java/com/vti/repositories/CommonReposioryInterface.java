package com.vti.repositories;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface CommonReposioryInterface<T> {
	int insert(T entity) throws SQLException;

	int update(T entity) throws SQLException;

	int delelte(long id) throws SQLException;

	T getById(long id) throws SQLException;

	List<T> search(Map<String, ?> conditionMap) throws SQLException;
	
	long getMaxId() throws SQLException;
}
