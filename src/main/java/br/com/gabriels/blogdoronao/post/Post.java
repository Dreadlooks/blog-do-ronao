package br.com.gabriels.blogdoronao.post;

import javax.persistence.*;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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

    @NotNull
    @Enumerated(value = EnumType.STRING)
    private Category category;

    @FutureOrPresent
    private LocalDate date;

    @Deprecated
    public Post() {}

    public Post(@NotBlank String title, @NotBlank String author, @NotBlank String text, @NotNull Category category) {
        this.title= title;
        this.author = author;
        this.text = text;
        this.category = category;
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

    public Category getCategory() {
        return category;
    }

    public LocalDate getDate() {
        return date;
    }
}
