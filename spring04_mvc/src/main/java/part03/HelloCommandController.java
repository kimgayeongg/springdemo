package part03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

// http://localhost:8090/myapp/mem.htm


@Controller
public class HelloCommandController {

	public HelloCommandController() {

	}


	
	@GetMapping("/mem.htm")
//	@RequestMapping(value = "/mem.htm", method = RequestMethod.GET)
	public String form() {
		return "part03/memForm";
	}
	
//	@PostMapping("/mem.htm")
////	@RequestMapping(value="/mem.htm", method = RequestMethod.POST)
//	public String submit(MemDTO dto) {
//		return "part03/memPro";
//		 
//	}
	@PostMapping("/mem.htm")
////@RequestMapping(value="/mem.htm", method = RequestMethod.POST)
public String submit(@ModelAttribute("mt") MemDTO dto) {
	return "part03/memPro"; 
	 
}
}
