package com.vti.repositories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;

public abstract class CommonRepository<T> implements CommonReposioryInterface<T> {

	public int executeUpdate(String sql) throws SQLException {
		Connection connection = getConnect();
		try {
			Statement statement = connection.createStatement();
			int recordAmount = statement.executeUpdate(sql);

			return recordAmount;
		} finally {
			connection.close();
		}
	}

	public int executeUpdate(String sql, T entity) throws SQLException {
		Connection connection = getConnect();
		try {

			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			int recordAmount = executeUpdate(preparedStatement, entity);

			return recordAmount;
		} finally {
			connection.close();
		}
	}

	public abstract int executeUpdate(PreparedStatement preparedStatement, T entity) throws SQLException;

	public List<T> executeQuery(String sql) throws SQLException {
		Connection connection = getConnect();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			return getDataTable(resultSet);
		} finally {
			connection.close();
		}
	}

	public abstract List<T> getDataTable(ResultSet resultSet) throws SQLException;

	public long getMaxId(String tableName, String idName) throws SQLException {
		Connection connection = getConnect();
		try {
			Statement statement = connection.createStatement();
			String sql = "select max(" + idName + ") as id from " + tableName;
			ResultSet resultSet = statement.executeQuery(sql);
			if (resultSet.next()) {
				return resultSet.getLong("id");
			}

		} finally {
			connection.close();
		}

		return 0;
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
