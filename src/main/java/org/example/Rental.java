package org.example;
import java.util.Date;


public class Rental {
    private int id;
    private Movie movie;
    private Customer customer;
    private Date rentalDate;
    private Date returnDate;

    public Movie getMovie() {
        return movie;
    }

    public Rental(Movie movie, Customer customer, int id){
        this.customer=customer;
        this.id=id;
        movie.setAvailable(true);
        Date now = new Date();
        rentalDate = now;
        this.movie=movie;
        rentalDate = new Date();
    }


    public int getId() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public Date getRentalDate() {
        return rentalDate;
    }
    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date date) {
        returnDate = date;
    }


}