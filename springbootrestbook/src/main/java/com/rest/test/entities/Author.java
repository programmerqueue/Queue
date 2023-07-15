/**
 * 
 */
package com.rest.test.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author AR
 *
 */
@Entity
public class Author {
	@Id
	private int author_id;
	private String firstname;
	private String lastname;
	private String language;

	public int getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Author [author_id=" + author_id + ", firstname=" + firstname + ", lastname=" + lastname + ", language="
				+ language + "]";
	}

	public Author(int author_id, String firstname, String lastname, String language) {
		super();
		this.author_id = author_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.language = language;
	}

	public Author() {
		super();
	}

}
