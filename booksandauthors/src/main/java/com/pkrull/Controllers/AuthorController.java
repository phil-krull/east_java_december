package com.pkrull.Controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pkrull.Models.Author;
import com.pkrull.Models.Book;
import com.pkrull.Services.AuthorService;
import com.pkrull.Services.BookService;

@Controller
public class AuthorController {
	private final AuthorService authorService;
	private final BookService bookService;
	
	public AuthorController(AuthorService aService, BookService bService) {
		this.authorService = aService;
		this.bookService = bService;
	}
	
	@RequestMapping("/authorandbooks")
	public String index(@ModelAttribute("author") Author author, @ModelAttribute("book") Book book, Model model) {
		model.addAttribute("authors", authorService.allAuthors());
		model.addAttribute("books", bookService.allBooks());
		return "index.jsp";
	}
	
	@PostMapping("/authors")
	// or
	// @RequestMapping(value="/books", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("author") Author author, BindingResult result) {
		if (result.hasErrors()) {
            return "index.jsp";
        } else {
            authorService.createAuthor(author);
            return "redirect:/";
        }
	}
	
	
}
