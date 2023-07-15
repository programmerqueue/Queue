/**
 * 
 */
package springmvc.dao.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import springmvc.dao.ClientDaoInterface;
import springmvc.model.Client;

/**
 * @author AR
 *
 */
@Repository
public class ClientDaoImpl implements ClientDaoInterface{
	
	@Autowired
    private HibernateTemplate hibernateTemplate;
	
    @Transactional
	public int save(Client clientDao) {
		int i = (Integer)this.hibernateTemplate.save(clientDao);
		return i;
	}
	
}
