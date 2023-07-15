/**
 * 
 */
package com.map.manytoone;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author AR
 *
 */
@Entity
@Table(name = "question_123")
public class Question {
	@Id
	private int q_id;
	private String q_name;
	@ManyToOne
	private Answer answer;

	public int getQ_id() {
		return q_id;
	}

	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}

	public String getQ_name() {
		return q_name;
	}

	public void setQ_name(String q_name) {
		this.q_name = q_name;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public Question() {
		super();
	}

	public Question(int q_id, String q_name, Answer answer) {
		super();
		this.q_id = q_id;
		this.q_name = q_name;
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [q_id=" + q_id + ", q_name=" + q_name + ", answer=" + answer + "]";
	}

}
