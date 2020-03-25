package br.com.gabriels.blogdoronao.post;

public enum Category {

    EDUCATION("Educação"),
    TECNOLOGY("Tecnologia"),
    SPORTS("Esportes"),
    POLITICS("Politica"),
    HOME("HOME & HEALTH");

    private String name;

    Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
