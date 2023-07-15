/**
 * 
 */
package com.restapi.crud.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.crud.model.Product;
import com.restapi.crud.service.ProductService;

/**
 * @author M Abdul Razzaque
 *
 */
@RestController
@RequestMapping("/api")
public class ProductController {
	@Autowired
	private ProductService productService;

//	CREATE
	@PostMapping("/categories")
	public void add(@RequestBody Product product) {
		productService.save(product);
		System.out.println(product);
	}

//	READ
	@GetMapping("/categories")
	public List<Product> list() {
		return (List<Product>) productService.listAll();
	}

	@GetMapping("/categories/{id}")
	public Product getbyId(int id) {
		return productService.get(id);

	}

//	UPDATE
	@PutMapping("/categories/{id}")
	public ResponseEntity<?> update(@RequestBody Product product, @PathVariable("id") int id) {
		try {
			Product existProduct = productService.get(id);
			productService.save(product);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

//	DELETE
	@DeleteMapping("/categories/{id}")
	public void delete(@PathVariable("id") int id) {
		productService.delete(id);
	}

}
