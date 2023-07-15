/**
 * 
 */
package com.restapi.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi.crud.model.Product;

/**
 * @author M Abdul Razzaque
 *
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
