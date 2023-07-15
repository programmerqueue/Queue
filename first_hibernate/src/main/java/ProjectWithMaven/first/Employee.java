/**
 * 
 */
package ProjectWithMaven.first;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;


import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * @author AR
 *
 */
@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)

public class Employee {
	@Id
	private int id;
	private String name;
	private String city;
	private String Company;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", Company=" + Company + "]";
	}

	public Employee(int id, String name, String city, String company) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		Company = company;
	}

	public Employee() {
		super();
	}

}
