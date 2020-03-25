package br.com.gabriels.blogdoronao.post;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class NewPostForm {

    @NotBlank
    private String title;

    @NotBlank
    private String author;

    @NotBlank
    private String text;

    @NotNull
    private Category category;

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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Post toModel() {
        return new Post(this.title, this.author, this.text, this.category);
    }
}
