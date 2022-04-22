package com.vti.repositories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.vti.entities.Account;

public class AccountRepository extends CommonRepository<Account> {

	public int insert(Account entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(Account entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delelte(long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Account getById(long id) throws SQLException {
		String sql = "select * from account where account_id = " + id;
		List<Account> accounts = this.executeQuery(sql);
		return accounts.isEmpty() ? null : accounts.get(0);
	}

	public List<Account> search(Map<String, ?> conditionMap) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int executeUpdate(PreparedStatement preparedStatement, Account entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Account> getDataTable(ResultSet resultSet) {
		// TODO Auto-generated method stub
		return null;
	}

	public long getMaxId() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
