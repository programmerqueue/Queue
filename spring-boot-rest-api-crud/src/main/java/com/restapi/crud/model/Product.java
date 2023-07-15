/**
 * 
 */
package com.restapi.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author AR
 *
 */
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_generator")
	private Integer pId;
	@Column(name = "p_name")
	private String name;
	@Column(name = "p_price")
	private float price;

	public Integer getId() {
		return pId;
	}

	public void setId(Integer productId) {
		this.pId = productId;
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

	@Override
	public String toString() {
		return "Product [id=" + pId + ", name=" + name + ", price=" + price + "]";
	}

	public Product() {
		super();
	}

	public Product(Integer productId, String name, float price) {
		super();
		this.pId = productId;
		this.name = name;
		this.price = price;
	}
}
