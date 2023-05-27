package org.example;

import java.util.Date;
import java.util.List;
public class Item {
    protected  String title;
    protected String genre;
    protected Date releaseDate;
    protected boolean Available;
    protected int id;


    public Item(String title, String genre, Date releaseDate, int id){
        this.id=id;
        this.genre=genre;
        this.title=title;
        this.releaseDate=releaseDate;
        Available=true;

    }


    public void setAvailable(boolean available) {
        this.Available = available;
    }


    public String getGenre() {
        return genre;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public Date getReleaseDate() {
        return releaseDate;
    }
    public boolean isAvailable(){
        return Available;
    }


    public void rentItem1(Customer customer){
        RentalStore rentalStore = new RentalStore();
        rentalStore.rentItem(customer, this);
    }
}
