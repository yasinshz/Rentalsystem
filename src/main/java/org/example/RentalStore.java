package org.example;
import java.util.ArrayList;
import java.util.List;

public class RentalStore {
    private List<Movie> movies = new ArrayList<Movie>();
    private List<Customer> customers = new ArrayList<Customer>();

    public void register(Customer customer){
        customers.add(customer);
    }
    public void addMovie(Movie Movie){
        movies.add(Movie);
    }
    public void removeMovie(Movie Movie){
        movies.remove(Movie);
    }
    public List getAvailablemovies(){
        List<Movie> available = new ArrayList<Movie>();
        for (Movie x :movies){
            if (x.isAvailabe()==true){
                available.add(x);
            }
        }
        return available;
    }
    public void rentMovie(Customer customer, Movie movie){

        int id = movie.getMovieID();
        boolean find = false;
        for (Movie i: movies) {
            if (i==movie){
                find = true;
                break;
            }
        }
        if (find == false){
            System.out.println("Movie not in list!!!");
            return ;
        }
        if (movie.isAvailabe() == false){
            System.out.println("Movie is not available");
        }

        String rentID = String.valueOf(movie.getMovieID()).concat(String.valueOf(customer.getId()));
        int ID = Integer.parseInt(rentID);
        Rental rental = new Rental(movie ,customer , ID);
        customer.getRentals().add(rental);
        movie.setAvailable(false);
    }

    public void returnMovie(Rental rental){
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

        rental.getMovie().setAvailable(true);
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

    public Movie getMovieByID(int id){
        int index = -2;
        boolean find = false;
        for (int i=0;i<movies.size();i++){
            if (movies.get(i).getMovieID() == id){
                index = i;
                find=true;
                break;
            }
        }
        if (find==false){
            System.out.println("Not found");
            return null;
        }
        return movies.get(index);
    }
}