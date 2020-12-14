package com.pkrull.Controllers;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pkrull.Models.Author;
import com.pkrull.Models.Book;
import com.pkrull.Services.AuthorService;
import com.pkrull.Services.BookService;

@Controller
public class BookController {
	
	private final BookService bookService;
	
	public BookController(BookService bService) {
		this.bookService = bService;
	}
	
	@PostMapping("/books")
	public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
		if(result.hasErrors()) {
			return "index.jsp";
		} else {
			bookService.addBook(book);
			return "redirect:/";
			
		}
	}
}
