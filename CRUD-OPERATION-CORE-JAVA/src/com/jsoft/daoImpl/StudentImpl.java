/**
 * 
 */
package com.jsoft.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Wrapper;
import java.util.ArrayList;
import java.util.List;

import com.jsoft.dao.StudentDao;
import com.jsoft.pojo.Student;
import com.jsoft.utility.DbConnection;

/**
 * @author AR
 *
 */
public class StudentImpl implements StudentDao {

//	@Override
//	public void create(Student student) {
//		Connection con = null;
//		PreparedStatement prepareStatement = null;
//		String sql = "insert into Student(name, college, gender) values(?,?,?)";
//		con = DbConnection.getConnection();
//		try {
//			prepareStatement = con.prepareStatement(sql);
//			prepareStatement.setString(1, student.getName());
//			prepareStatement.setString(2, student.getCollege());
//			prepareStatement.setString(3, student.getGender());
//			int i = prepareStatement.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//
//	}

//	@Override
//	public List<Student> read() {
//		Connection con = null;
//		Statement stmt = null;
//		ResultSet rs1 = null;
//		List<Student> list = new ArrayList<Student>();
//		String sql = "select * from Student";
//		con = DbConnection.getConnection();
//		
//		try {
//			stmt = con.createStatement();
//			rs1 = stmt.executeQuery(sql);
//			while (rs1.next()) {
//				Student student = new Student();
//				student.setRollno(rs1.getInt("rollno"));
//				student.setName(rs1.getString("name"));
//				student.setName(rs1.getString("college"));
//				student.setName(rs1.getString("gender"));
//				list.add(student);
//			}
//			con.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return list;
//	}

	@Override
	public void update(Student student) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "update Student set name=? where rollno=?";
		try {
			con = DbConnection.getConnection();
			con.prepareStatement(sql);
			ps.setString(1, student.getName());
			ps.setInt(2, 3);
			int i = ps.executeUpdate();
			System.out.println("record is updated: " + i);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

//	@Override
//	public void delete(Student student) {
//		Connection con = null;
//		PreparedStatement ps = null;
//		Statement stmt = null;
//		String sql = "delete from Student where rollno=?";
//		try {
//			con = DbConnection.getConnection();
//			ps = con.prepareStatement(sql);
//			ps.setInt(1, 3);
//			int i = ps.executeUpdate();
//            con.close();
//			System.out.println("record is delete : " + i);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}

}