/**
 * 
 */
package com.pro.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pro.dao.StudentDao;
import com.pro.pojo.Student;
import com.pro.utility.DbConnection;

/**
 * @author AR
 *
 */
public class StudentDaoImpl implements StudentDao {

//	@Override
//	public void update(Student student) {
//		Connection con = null;
//		PreparedStatement ps = null;
//		String sql = "update Student set name=? where rollno=?";
//		con = DbConnection.getConnection();
//		try {
//			ps = con.prepareStatement(sql);
//			ps.setString(1, student.getName());
//			ps.setInt(2, 2);
//			int i = ps.executeUpdate();
//			System.out.println("record is updated : " + i);
//          con.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//
//	}

	@Override
	public void delete(Student student) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "delete from Student where rollno=?";
		con = DbConnection.getConnection();
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, 7);
			int i = ps.executeUpdate();
			System.out.println("record is deleted : " + i);
			con.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

//	@Override
//	public void create(Student student) {
//		PreparedStatement ps = null;
//		Connection con = null;
//		String sql = "insert into Student(name,college,gender) values(?,?,?)";
//		con = DbConnection.getConnection();
//		try {
//			ps = con.prepareStatement(sql);
//			ps.setString(1, student.getName());  
//			ps.setString(2, student.getCollege());
//			ps.setString(3, student.getGender());
//			int i = ps.executeUpdate();
//			System.out.println("record is inserted : " + i);
//			con.close();
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		}
//
//	}

//	public List<Student> read() {
//		Connection con = null;
//		PreparedStatement ps = null;
//		ResultSet rs= null;
//		List<Student> list = new ArrayList<Student>();
//		String sql = "select * from Student";
//		con = DbConnection.getConnection();
//		try {
//			 ps = con.prepareStatement(sql);
//			 rs = ps.executeQuery();
//			 while(rs.next()) {
//				 Student student = new Student();
//				 student.setRollno(rs.getInt("rollno"));
//				 student.setName(rs.getString("name"));
//				 student.setCollege(rs.getString("college"));
//				 student.setGender(rs.getString("gender"));
//				 list.add(student);
//			 }
//			con.close();
//		} catch (SQLException e) {
//			
//			e.printStackTrace();
//		}
//		return list;
//	}

}
