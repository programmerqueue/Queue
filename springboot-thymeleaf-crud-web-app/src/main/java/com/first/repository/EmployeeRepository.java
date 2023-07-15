/**
 * 
 */
package com.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.first.model.Employee;

/**
 * @author AR
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

//	Page<Employee> findAll(Pageable pageable);

}
