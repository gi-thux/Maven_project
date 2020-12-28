package com.vastica.udm.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vastica.udm.model.User;
import com.vastica.udm.utility.DbUtility;

public class UserDaoImp implements UserDao{
	
	 public static final String SAVE_SQL="insert into new_table(demo_name,age,mobile_No,salary,is_Active) values(?,?,?,?,?)";

	@Override
	public int saveUserInfo(User user) {
	int result =0;
try(
		PreparedStatement ps=DbUtility.getConnection().prepareStatement(SAVE_SQL);){
		ps.setString(1,user.getUsername());
		ps.setLong(2, user.getAge());
		ps.setLong(3,user.getMobile_No());
		ps.setDouble(4,user.getSalary());
		ps.setBoolean(5, user.setIs_Active());
		result=ps.executeUpdate();
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
return result;
}}
