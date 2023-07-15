/**
 * 
 */
package com.pro.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pro.bean.UserBean;
import com.pro.dao.InsertDao;
import com.pro.utility.DbConnecton;

/**
 * @author AR
 *
 */
public class InsertDaoImpl implements InsertDao {
	@Override
	public void insert(UserBean userBean) {
		Connection con = null;
		PreparedStatement ps = null;
		String query = "insert into Person(uname,pwd,email,contact,age) values(?,?,?,?,?)";
		con = DbConnecton.getConnection();
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, userBean.getUname());
			ps.setString(2, userBean.getPwd());
			ps.setString(3, userBean.getEmail());
			ps.setString(4, userBean.getContact());
			ps.setInt(5, userBean.getAge());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	@Override
	public List<UserBean> getValues() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		UserBean userBean = null;
		List<UserBean> list = new ArrayList<UserBean>();
		String query = "select * from Person";
		con = DbConnecton.getConnection();
		try {
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				userBean = new UserBean();
				userBean.setId(rs.getInt("id"));
				userBean.setUname(rs.getString("uname"));
				userBean.setPwd(rs.getString("pwd"));
				userBean.setEmail(rs.getString("email"));
				userBean.setContact(rs.getString("contact"));
				userBean.setAge(rs.getInt("age"));
				list.add(userBean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
