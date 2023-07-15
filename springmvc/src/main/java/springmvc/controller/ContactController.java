
/**
 * 
 */
package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;

/**
 * @author AR
 *
 */
@Controller
public class ContactController {
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

//	@RequestMapping(path = "/processfrom", method = RequestMethod.POST)
//	public String handleForm(@ModelAttribute User user, Model model) {
//		System.out.println(user);
//		model.addAttribute("user", user);
//		return "success1";
//	}
	@RequestMapping(path = "/processfrom", method = RequestMethod.POST)
	public String handleForm(@RequestParam("email") String userEmail, @RequestParam("userName") String userName,
			@RequestParam("password") String userPassword, Model model) {
		System.out.println("user email:" + userEmail);
		System.out.println("user name:" + userName);
		System.out.println("user password:" + userPassword);
//		User user = new User();
//		user.setUserName(userName);
//		user.setEmail(userEmail);
//		user.setPassword(userPassword);

//		System.out.println(user);
		 model.addAttribute("name", userName);
		 model.addAttribute("email", userEmail);
		 model.addAttribute("password",userPassword);
//		model.addAttribute("user", user);
		return "success1";
	}
}