	/**
 * 
 */
package com.pro.dao;

import java.util.List;

import com.pro.bean.UserBean;

/**
 * @author AR
 *
 */
public interface InsertDao {
	public void insert(UserBean userBean);
	public List<UserBean> getValues();
}
