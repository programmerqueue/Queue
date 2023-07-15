/**
 * 
 */
package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author AR
 *
 */
@Controller
public class HomeController {
	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public String home(Model model) {
		System.out.println("this is home controller");
		model.addAttribute("name", "Abdul Razzaque M");
		model.addAttribute("id", 211);
		List<String> list1 = new ArrayList<String>();
		list1.add("Abdullah");
		list1.add("Mastan");
		model.addAttribute("s", list1);
		return "index";
	}

	@RequestMapping("/user/{userId}")
	public String getUserDetail(@PathVariable("userId") int userId) {
		System.out.println(userId);
		return "demo";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about controller");

		return "demo";
	}

	@RequestMapping("/help")
	public ModelAndView help() {

		System.out.println("this is help controller");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("Name", "Abdullah");
		modelAndView.addObject("RollNo", 211);
		LocalDateTime localDateTime = LocalDateTime.now();
		modelAndView.addObject("time", localDateTime);
		List<Integer> list = new ArrayList<Integer>();
		list.add(123);
		list.add(1234);
		list.add(12345);
		modelAndView.addObject("No", list);
		modelAndView.setViewName("user");
		return modelAndView;
	}
}
