/**
 * 
 */
package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.Impl.ClientDaoImpl;
import springmvc.model.Client;

/**
 * @author AR
 *
 */
@Service
public class ClientService {
	
	@Autowired
	private ClientDaoImpl clientDaoImpl;

	public int createClient(Client client) {
		return this.clientDaoImpl.save(client);
		
	}
}
