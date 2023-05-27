package org.example;

import java.util.Date;

public class Book extends  Item{
    private String author;
    private String publisher;
    public Book(String title, String genre, Date releaseDate, int id , String author , String publisher) {
        super(title, genre, releaseDate, id);
        this.author = author;
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getAuthor() {
        return author;
    }
}
