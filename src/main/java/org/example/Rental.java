package org.example;

import java.util.Date;


public class Rental {
    private int id;
    private Item item;
    private Customer customer;
    private Date rentalDate;
    private Date returnDate;

    public Item getItem() {
        return item;
    }

    public Rental(Item item, Customer customer, int id){
        this.customer=customer;
        this.id=id;
        item.setAvailable(true);
        Date now = new Date();
        rentalDate = now;
        this.item=item;
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