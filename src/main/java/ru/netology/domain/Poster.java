package ru.netology.domain;

public class Poster {

    private String title;
    private int id;
    private String genre;
    private int limit;


    public Poster(String title, int id, String genre) {
        this.title = title;
        this.id = id;
        this.genre = genre;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getGenre() {

        return genre;
    }

    public void setGenre(String genre) {

        this.genre = genre;
    }

}

