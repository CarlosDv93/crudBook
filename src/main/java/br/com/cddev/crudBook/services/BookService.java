package br.com.cddev.crudBook.services;

import br.com.cddev.crudBook.entities.BookEntity;
import br.com.cddev.crudBook.model.mappers.BookMapper;
import br.com.cddev.crudBook.model.dto.BookDto;
import br.com.cddev.crudBook.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookMapper mapper;

    public List<BookDto> getAll() {
        var books = bookRepository.findAll();
        var booksDTO = new ArrayList<BookDto>();

        for (BookEntity book : books) {
            booksDTO.add(mapper.toBookDto(book));
        }

        return booksDTO;
    }

    public BookEntity findById(Long id){
        return bookRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Book not found"));
    }

    public BookDto saveBook(BookDto book){
        var bookEntity = mapper.toBookEntity(book);
        var savedBook = bookRepository.save(bookEntity);
        return mapper.toBookDto(savedBook);
    }

    public void deleteABook(Long id){
        bookRepository.deleteById(id);
    }

    public BookDto updateBook(BookDto book){
        var bookEntity = mapper.toBookEntity(book);
        return mapper.toBookDto(bookRepository.save(bookEntity));
    }
}
