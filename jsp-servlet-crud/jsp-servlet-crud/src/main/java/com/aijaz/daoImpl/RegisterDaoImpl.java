package com.aijaz.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.aijaz.dao.RegisterDao;
import com.aijaz.pojo.Person;
import com.aijaz.util.JDBCCONnection;

public class RegisterDaoImpl implements RegisterDao {
//	public static void main(String[] args) {
//		Connection con = JDBCCONnection.myConnection();
//		System.out.println(con);
//	}

	@Override
	public void savePerson(Person person) {
		System.out.println("savePerson method() called : " + new Date());
		Connection con = null;
		try {
//			PreparedStatement pstm = null;
			con = com.aijaz.util.JDBCCONnection.myConnection();
			System.out.println("connection : " + con);
			String query = "insert into Person(FirstName,LastName,Address) values(?,?,?)";
			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setString(1, person.getFirstName());
			pstm.setString(2, person.getLastName());
			pstm.setString(3, person.getAddress());
			int i = pstm.executeUpdate();
			if (i >= 1) {
				System.out.println(i + " value is inserted...");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Person> getAllPerson() {
		List<Person> list = new ArrayList<Person>();
		Connection con = null;
		try {
			con = com.aijaz.util.JDBCCONnection.myConnection();
			String query = "select * from Person";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				Person person = new Person();
				person.setPersonId(rs.getInt("PersonID"));
				person.setAddress(rs.getString("Address"));
				person.setFirstName(rs.getString("FirstName"));
				person.setLastName(rs.getString("LastName"));
				System.out.println(person);
				list.add(person);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void deleteOneValue(int personId) {
		
		Connection con = null;
		PreparedStatement pstm=null;
		try {
			con = JDBCCONnection.myConnection();
			String query = "delete from Person where PersonID=?";
			pstm = con.prepareStatement(query);
			pstm.setInt(1, personId);
			int i=pstm.executeUpdate();
			if(i==1) {
				System.out.println("this id is deleted "+personId);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updatePerson(Person person) {
		System.out.println("updatePerson method() called : " + new Date());
		Connection con = null;
		try {
//			PreparedStatement pstm = null;
			con = com.aijaz.util.JDBCCONnection.myConnection();
			System.out.println("connection : " + con);
			String query = "update Person set FirstName=?,LastName=?,Address=? where PersonID=?";
			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setString(1, person.getFirstName());
			pstm.setString(2, person.getLastName());
			pstm.setString(3, person.getAddress());
			pstm.setInt(4, person.getPersonId());
			int i = pstm.executeUpdate();
			if (i >= 1) {
				System.out.println(i + " value is updated..."+person.getPersonId());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
	}

}
