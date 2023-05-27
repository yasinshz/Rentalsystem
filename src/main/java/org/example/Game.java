package org.example;

import java.util.Date;

public class Game extends Item{
    private String platForm;
    private String publisher;
    public Game(String title, String genre, Date releaseDate, int id , String platForm , String publisher) {
        super(title, genre, releaseDate, id);
        this.platForm = platForm;
        this.publisher = publisher;
    }

    public String getPlatForm() {
        return platForm;
    }

    public String getPublisher() {
        return publisher;
    }
}
