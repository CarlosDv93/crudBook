package br.com.cddev.crudBook.model.dto;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class BookDto implements Serializable {
    private Long id;
    private String name;
    private String author;
    private String category;
}
