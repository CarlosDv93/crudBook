package br.com.cddev.crudBook.controllers;

import br.com.cddev.crudBook.model.dto.BookDto;
import br.com.cddev.crudBook.services.BookService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    private BookService service;

    @ApiOperation(value = "Return all the books")
    @GetMapping(value = "/", produces = "application/json")
    public List<BookDto> getBooks() {
        return service.getAll();
    }

    @ApiOperation(value = "Save a book")
    @PostMapping(value = "/", produces = "application/json")
    public BookDto saveBook(@RequestBody BookDto bookDto) {
        return service.saveBook(bookDto);
    }

    @ApiOperation(value = "Update a book")
    @PutMapping(value = "/", produces = "application/json")
    public BookDto updateBook(@RequestBody BookDto bookDto) {
        return service.updateBook(bookDto);
    }

    @ApiOperation(value = "Delete a book")
    @DeleteMapping(value = "/{id}", produces = "application/json")
    public void deleteBook(@PathVariable("id") Long id) {
        service.deleteABook(id);
    }
}
