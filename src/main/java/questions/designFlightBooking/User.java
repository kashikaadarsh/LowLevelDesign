package questions.designFlightBooking;
import java.util.*;

public class User {
    private int userId;
    private String username;
    private String email;

    private Set<Flight> bookedFlights;

    public User(int userId, String username, String email){
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.bookedFlights = new HashSet<>();
    }

    public int getUserId(){
        return this.userId;
    }
    public String getUsername(){
        return this.username;
    }
    public String getEmail(){
        return this.email;
    }

    public Set<Flight> getBookedFlights(){
        return this.bookedFlights;
    }




}
