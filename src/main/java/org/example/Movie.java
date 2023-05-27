package org.example;
import java.util.Date;

public class Movie {
    private final String title;
    private final String director;
    private final String genre;
    private final String cast;
    private final Date realeaseDate;
    private boolean available;
    private int movie_count = 1;
    private int movieID;


    public Movie(String title,String genre, String director, String cast, Date realeaseDate , int bookID) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.cast = cast;
        this.realeaseDate = realeaseDate;
        available = true;
        movieID = movie_count;
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
        return realeaseDate;
    }

}