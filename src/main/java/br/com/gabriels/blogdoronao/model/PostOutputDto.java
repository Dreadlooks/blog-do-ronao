package br.com.gabriels.blogdoronao.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class PostOutputDto {

    private Long id;
    private String title;
    private String author;
    private String text;
    private LocalDate date;

    public PostOutputDto(Post post) {
        this.id = post.getId();
        this.title = post.getTitle();
        this.author = post.getAuthor();
        this.text = post.getText();
        this.date = post.getDate();
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

    public String getFormattedDate() {
        return date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
    }


}
