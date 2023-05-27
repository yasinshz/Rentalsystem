package org.example;

import java.util.ArrayList;
import java.util.List;

public class RentalStore {
    private List<Item> items = new ArrayList<Item>();
    private List<Customer> customers = new ArrayList<Customer>();

    public void register(Customer customer){
        customers.add(customer);
    }
    public void addItem(Item item){
        items.add(item);
    }
    public void removeItem(Item item){
        items.remove(item);
    }
    public List getAvailableItems(){
        List<Item> available = new ArrayList<Item>();
        for (Item x :items){
            if (x.isAvailable()==true){
                available.add(x);
            }
        }
        return available;
    }
    public void rentItem(Customer customer, Item item){

        int id = item.getId();
        boolean find = false;
        for (Item i: items) {
            if (i==item){
                find = true;
                break;
            }
        }
        if (find == false){
            System.out.println("Item not in list!!!");
            return ;
        }
        if (item.isAvailable() == false){
            System.out.println("Item is not available");
        }

        String rentID = String.valueOf(item.getId()).concat(String.valueOf(customer.getId()));
        int ID = Integer.parseInt(rentID);
        Rental rental = new Rental(item ,customer , ID);
        customer.getRentals().add(rental);
        item.setAvailable(false);
    }

    public void returnItem(Rental rental){
        int index = -5;
        for (int j=0;j<customers.size();j++){
            if (customers.get(j).getRentals() == rental){
                index = j;
                break;
            }
        }

        if (index == -5){
            System.out.println("Not found");
            return ;
        }

        rental.getItem().setAvailable(true);
        customers.get(index).getRentals().remove(rental);
    }

    public Customer getCustomerByID(int id){
        int index = -2;
        boolean find = false;
        for (int i=0;i<customers.size();i++){
            if (customers.get(i).getId() == id){
                index = i;
                find=true;
                break;
            }
        }
        if (find==false){
            System.out.println("Not found");
            return null;
        }
        return customers.get(index);
    }

    public Item getItemByID(int id){
        int index = -2;
        boolean find = false;
        for (int i=0;i<items.size();i++){
            if (items.get(i).getId() == id){
                index = i;
                find=true;
                break;
            }
        }
        if (find==false){
            System.out.println("Not found");
            return null;
        }
        return items.get(index);
    }
}
