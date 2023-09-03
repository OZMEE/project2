package library.controllers;

import library.models.Book;
import library.models.Person;
import library.services.BooksService;
import library.services.PeopleService;
import library.util.BookValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {
    /*
    private final BookValidator bookValidator;
    private final BooksService booksService;

    private final PeopleService peopleService;

    @Autowired
    public BookController(BookValidator bookValidator, BooksService booksService, PeopleService peopleService){
        this.bookValidator = bookValidator;
        this.booksService = booksService;
        this.peopleService = peopleService;
    }

    @GetMapping()
    public String index(Model model){
        model.addAttribute("books", booksService.findAll());
        return "books/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model, @ModelAttribute("newPerson") Person newPerson){
        Book book = booksService.findById(id);
        model.addAttribute("book", book);
        model.addAttribute("people", peopleService.findAll());
        model.addAttribute("client", book.getOwner());

        return "books/show";
    }

    @GetMapping("/new")
    public String newBook(@ModelAttribute("book") Book book){
        return "books/new";
    }

    @PostMapping()
    public String create(@ModelAttribute("book") @Valid Book book, BindingResult bindingResult){
        bookValidator.validate(book, bindingResult);
        if(bindingResult.hasErrors()){
            return "books/new";
        }
        booksService.save(book);
        return "redirect:/books";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") int id){
        model.addAttribute("book", booksService.findById(id));
        return "books/edit";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id){
        booksService.deleteById(id);
        return "redirect:/books";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("book") Book book, @PathVariable("id") int id,
                         BindingResult bindingResult){
        bookValidator.validate(book, bindingResult);
        if(bindingResult.hasErrors()){
            return "books/edit";
        }
        booksService.update(id, book);
        return "redirect:/books";
    }

    @PatchMapping("/{id}/toAppoint")
    public String toAppoint(@PathVariable("id") int id, @ModelAttribute("newPerson") Person newPerson,
                        @ModelAttribute("book") Book book){
        booksDAO.toAppoint(id, newPerson.getId());
        return "redirect:/books";
    }
     */
}
