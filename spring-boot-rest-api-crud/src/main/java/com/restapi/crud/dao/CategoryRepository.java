/**
 * 
 */
package com.restapi.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.restapi.crud.model.Category;
import com.restapi.crud.model.Product;

/**
 * @author AR
 *
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
}
