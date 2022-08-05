package br.com.cddev.crudBook.model.mappers;

import br.com.cddev.crudBook.entities.BookEntity;
import br.com.cddev.crudBook.model.dto.BookDto;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface BookMapper {
    BookEntity toBookEntity(BookDto dto);

    BookDto toBookDto(BookEntity entity);
}
