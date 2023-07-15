/**
 * 
 */
package com.restapi.crud.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author M Abdul Razzaque
 *
 */
@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Category_generator")
	private Integer cid;
	@Column(name = "category_name")
	private String name;
	@Column(name = "category_price")
	private float price;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "productId", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JsonIgnore
	private List<Product> product;

	public Integer getId() {
		return cid;
	}

	public void setId(Integer cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Category [id=" + cid + ", name=" + name + ", price=" + price + ", product=" + product + "]";
	}

	public Category(Integer cid, String name, float price, List<Product> product) {
		super();
		this.cid = cid;
		this.name = name;
		this.price = price;
		this.product = product;
	}

	public Category() {
		super();
	}

}
