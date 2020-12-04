package com.pkrull.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/demo")
public class HomeController {
	@RequestMapping("")
	public String index() {
		return "Hello World!";
	}
	
	@RequestMapping("/name")
	public String name(@RequestParam(value="name", required = false) String name, @RequestParam(value="location", required = false) String loc) {
		return "Name: " + name + ", location:" + loc;
	}
	
	@RequestMapping("/location/{location}")
	public String location(@PathVariable("location") String loc) {
		if(loc.equals("tulsa")) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		return "Location: " + loc;
	}
	
	@RequestMapping("/show/{location}")
	public String show(Model model, @PathVariable("location")String loc) {
		String name = "Phil";
		model.addAttribute("userName", name);
		model.addAttribute("useLocation", loc);
		return "show.jsp";
	}
}
