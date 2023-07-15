/**
 * 
 */
package com.first.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.first.model.Employee;
import com.first.repository.EmployeeRepository;

/**
 * @author AR
 *
 */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> findAll = (List<Employee>) this.employeeRepository.findAll();
		return findAll;
	}

	@Override
	public void saveEmployee(Employee employee) {
		Employee save = this.employeeRepository.save(employee);
		System.out.println(save);
	}

	@Override
	public Employee getEmployeeById(long id) {
		Employee employee = null;
		Optional<Employee> optional = this.employeeRepository.findById(id);
		if (optional.isPresent()) {
			employee = optional.get();
		} else {
			throw new RuntimeException("Employee not found for id ::" + id);
		}
		return employee;
	}

	@Override
	public void deleteEmployeeById(long id) {
		this.employeeRepository.deleteById(id);

	}


	@Override
	public Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
		Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending()
				: Sort.by(sortField).descending();
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize,sort);
		return this.employeeRepository.findAll(pageable);
	}

}
