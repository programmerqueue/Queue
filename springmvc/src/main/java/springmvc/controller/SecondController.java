/**
 * 
 */
package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author AR
 *
 */
@Controller
public class SecondController {

	@RequestMapping("/second/{fid}")
	public String firstMethod(@PathVariable("fid") int fid) {
		System.out.println(fid);
		return "first";
	}
}
