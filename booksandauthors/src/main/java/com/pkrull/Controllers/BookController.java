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
	
	private final AuthorService authorService;
	private final BookService bookService;
	
	public BookController(AuthorService aService, BookService bService) {
		this.authorService = aService;
		this.bookService = bService;
	}
	
	@PostMapping("/books")
	public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
		if(result.hasErrors()) {
			return "index.jsp";
		} else {
			// first get the author
			// Author author = authorService.findAuthor(book.author);
			bookService.addBook(book);
			return "redirect:/";
			
		}
	}
}
