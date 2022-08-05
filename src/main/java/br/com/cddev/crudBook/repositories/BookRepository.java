package br.com.cddev.crudBook.repositories;

import br.com.cddev.crudBook.entities.BookEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<BookEntity, Long> {

}
