package br.com.gabriels.blogdoronao.model;

import javax.persistence.*;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String title;

    @NotBlank
    private String author;

    @NotBlank
    @Lob
    private String text;

    @FutureOrPresent
    private LocalDate date;

    @Deprecated
    public Post() {}

    public Post(@NotBlank String title, @NotBlank String author, @NotBlank String text) {
        this.title = title;
        this.author = author;
        this.text = text;
        this.date = LocalDate.now();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    public LocalDate getDate() {
        return date;
    }
}
