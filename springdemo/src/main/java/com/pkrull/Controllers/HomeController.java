package com.pkrull.Controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
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
		return "Location: " + loc;
	}
}
