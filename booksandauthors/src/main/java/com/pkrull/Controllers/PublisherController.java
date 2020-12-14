package com.pkrull.Controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pkrull.Models.Publisher;
import com.pkrull.Services.PublisherService;

@Controller
public class PublisherController {
	public final PublisherService publisherService;
	
	public PublisherController(PublisherService publisherService) {
		this.publisherService = publisherService;
	}
	
	@PostMapping("/publishers")
	public String addPublisher(@Valid @ModelAttribute("publisher") Publisher publisher, BindingResult result) {
		if(result.hasErrors()) {
			return "index.jsp";
		} else {
			publisherService.addPublisher(publisher);
			return "redirect:/authorandbooks";
		}
	}

}
