/**
 * 
 */
package com.pro.bean;

/**
 * @author AR
 *
 */
public class UserBean {
	private int id;
	private String uname;
	private String pwd;
	private String email;
	private String contact;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public UserBean() {
		super();
	}

	public UserBean(int id, String uname, String pwd, String email, String contact, int age) {
		super();
		this.id = id;
		this.uname = uname;
		this.pwd = pwd;
		this.email = email;
		this.contact = contact;
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserBean [id=" + id + ", uname=" + uname + ", pwd=" + pwd + ", email=" + email + ", contact=" + contact
				+ ", age=" + age + "]";
	}

}
