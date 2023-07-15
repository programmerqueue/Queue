/**
 * 
 */
package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

/**
 * @author AR
 *
 */
@Controller
public class RedirectController {
	@RequestMapping("/one1")
	public RedirectView one() {
		System.out.println("this is one handler");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("enjoy");
		return redirectView;
		//return "redirect:/enjoy";
	} 

	@RequestMapping("/enjoy")
	public String enjoy() {
		System.out.println("this is second handler[enjoy]");
		return "";
	}
}
