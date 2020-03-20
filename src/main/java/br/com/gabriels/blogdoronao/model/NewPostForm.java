package br.com.gabriels.blogdoronao.model;

import javax.validation.constraints.NotBlank;

public class NewPostForm {

    @NotBlank
    private String title;

    @NotBlank
    private String author;

    @NotBlank
    private String text;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Post toModel() {
        return new Post(this.title, this.author, this.text);
    }
}
