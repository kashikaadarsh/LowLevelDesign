package questions.FitnessApp.models;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name, email, location;
    private List<Booking> userBookings;
    public User(String name, String email, String location){
        this.name = name;
        this.location = location;
        this.email = email;
        this.userBookings = new ArrayList<>();

    }
    public String getUserName(){return this.name;}
    public String getUserEmail(){return this.email;}
    public String getUserLocation(){return this.location;}
    public List<Booking> getUserBookings(){return this.userBookings;}
    public void addUserBooking(Booking booking){
        this.userBookings.add(booking);
    }

}
