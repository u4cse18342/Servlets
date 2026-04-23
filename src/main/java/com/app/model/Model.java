package com.app.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Model {

	private String uName;
	private String uPassword;
	private String email;
	private String uCity;

	// Getters & Setters
	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getuCity() {
		return uCity;
	}

	public void setuCity(String uCity) {
		this.uCity = uCity;
	}

	// DB Logic
	public int register() {
		int row = 0;

		String sql = "INSERT INTO personalinfo (uname, upassword, email, ucity) VALUES (?, ?, ?, ?)";

		try (Connection con = JdbcUtility.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, uName);
			ps.setString(2, email);
			ps.setString(3, uPassword);
			ps.setString(4, uCity);

			row = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return row;
	}
}