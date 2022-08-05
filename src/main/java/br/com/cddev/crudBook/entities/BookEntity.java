package br.com.cddev.crudBook.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="book")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Basic
    @Column(nullable = false)
    private Long id;
    @Basic
    @Column(nullable = false)
    private String name;
    @Basic
    @Column(nullable = false)
    private String author;
    @Basic
    @Column(nullable = false)
    private String category;
}
