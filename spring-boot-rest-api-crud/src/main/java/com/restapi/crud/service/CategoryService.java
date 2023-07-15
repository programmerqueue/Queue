/**
 * 
 */
package com.restapi.crud.service;

import java.util.List;

//import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.crud.dao.CategoryRepository;
import com.restapi.crud.model.Category;
import com.restapi.crud.model.Product;

/**
 * @author AR
 *
 */
@Service
//@Transactional
public class CategoryService {
	@Autowired
	private CategoryRepository repo;

	public List<Category> listAll() {
		return (List<Category>) repo.findAll();
	}

	public void save(Category product) {
		repo.save(product);
	}

	public Category get(int id) {
		return repo.findById(id).get();

	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}
	
}
