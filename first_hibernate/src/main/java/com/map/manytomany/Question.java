/**
 * 
 */
package com.map.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author AR
 *
 */
@Entity
@Table(name = "ques1123")
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String qname;
	@ManyToMany(targetEntity = Answer.class, cascade = { CascadeType.ALL })
	@JoinTable(name = "q_ans1123", joinColumns = { @JoinColumn(name = "q_id") }, inverseJoinColumns = {
			@JoinColumn(name = "ans_id") })
	private List<Answer> answer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", qname=" + qname + ", answer=" + answer + "]";
	}

	public Question(int id, String qname, List<Answer> answer) {
		super();
		this.id = id;
		this.qname = qname;
		this.answer = answer;
	}

	public Question() {
		super();

	}

}
