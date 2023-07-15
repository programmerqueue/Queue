/**
 * 
 */
package productcrudapp.dao;

import java.util.List;

import productcrudapp.model.Product;

/**
 * @author AR
 *
 */
public interface ProductDao {
public void createProduct(Product product);
public List<Product> getProducts();
public void deleteProduct(int pid);
public Product getProduct(int pid);
}
