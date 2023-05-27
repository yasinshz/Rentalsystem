package org.example;

import java.util.Date;

public class Movie extends Item{
    private String director;
    private String cast;
    private boolean available;
    private int movie_count = 1;
    private int movieID;


    public Movie(String title,String genre, String director, String cast, Date realeaseDate , int MovieID) {
        super(title,genre,realeaseDate, MovieID);
        this.director = director;
        this.cast = cast;
        available = true;
        movie_count+=1;
    }
    public void setAvailable(boolean borrowed){
        this.available = borrowed;
    }
    public boolean isAvailabe(){
        return available;
    }
    public String getTitle() {
        return title;
    }

    public int getMovieID() {
        return movieID;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public String getCast() {
        return cast;
    }

    public Date getRealeaseDate() {
        return releaseDate;
    }

}