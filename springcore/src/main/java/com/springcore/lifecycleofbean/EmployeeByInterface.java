/**
* 
*/
package com.springcore.lifecycleofbean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author Abdul Razzaque M
 *
 */
public class EmployeeByInterface implements InitializingBean, DisposableBean {
	private String E_name;
	private int E_id;

	public String getE_name() {
		return E_name;
	}

	public void setE_name(String e_name) {
		E_name = e_name;
	}

	public int getE_id() {
		return E_id;
	}

	public void setE_id(int e_id) {
		E_id = e_id;
	}

	@Override
	public String toString() {
		return "Employee [E_name=" + E_name + ", E_id=" + E_id + "]";
	}

	public EmployeeByInterface() {
		super();

	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("invoke init:");

	}

	public void destroy() throws Exception {
		System.out.println("invoke destroy:");

	}

}
