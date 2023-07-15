/**
 * 
 */
package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.Client;
import springmvc.service.ClientService;

/**
 * @author AR
 *
 */
@Controller("/first1")
public class FirstContactController {

	@Autowired
	private ClientService clientService;

	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("demo", "Abdul Razzaque");
		m.addAttribute("desc", "Home for programmer");
		System.out.println("adding common data to model");
	}

	@RequestMapping("/contact")
	public String showForm(Model m) {

		System.out.println("creating form");
		return "contact1";
	}

	@RequestMapping(path = "/processfrom", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute Client client, Model model) {
		System.out.println(client);
		model.addAttribute("user", client);
		this.clientService.createClient(client);
		return "success1";
	}
}
