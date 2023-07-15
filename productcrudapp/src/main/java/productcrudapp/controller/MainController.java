/**
 * 
 */
package productcrudapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;
import productcrudapp.dao.daoimpl.ProductDaoImpl;
import productcrudapp.model.Product;

/**
 * @author AR
 *
 */
@Controller
public class MainController {

	@Autowired
	private ProductDaoImpl productDaoImpl;

	@RequestMapping("/")
	public String home(Model m) {
		List<Product> products = productDaoImpl.getProducts();
		m.addAttribute("products", products);
		return "index";
	}

	// show add product form
	@RequestMapping("/add-product")
	public String addProduct(Model model) {
		model.addAttribute("title", "Add Product");
		return "add_product_form";
	}

	// handle add product form
	@RequestMapping(value = "/handle-product", method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product, HttpServletRequest request) {
		System.out.println(product);
		this.productDaoImpl.createProduct(product);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}

	// delete handler
	@RequestMapping("/delete/{productId}")
	public RedirectView handleProduct(@PathVariable("productId") int productId, HttpServletRequest request) {
		this.productDaoImpl.deleteProduct(productId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}

	@RequestMapping("/update/{productId}")
	public String updateForm(@PathVariable("productId") int pid, Model model) {
		Product product = this.productDaoImpl.getProduct(pid);
		model.addAttribute("product", product);
		return "update_form";
	}
}
