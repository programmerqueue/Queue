/**
 * 
 */
package com.first.service;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.first.model.Employee;

/**
 * @author AR
 *
 */
public interface EmployeeService {

	public List<Employee> getAllEmployees();

	public void saveEmployee(Employee employee);

	public Employee getEmployeeById(long id);

	public void deleteEmployeeById(long id);

	public Page<Employee> findPaginated(int pageNo, int pageSize,String sortField,String sortDirection);
}
