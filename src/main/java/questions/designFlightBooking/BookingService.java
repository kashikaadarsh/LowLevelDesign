package questions.designFlightBooking;
import java.util.*;

public class BookingService {
    private HashMap<Integer, Booking> bookings;
    private HashMap<Integer, Flight> flights;
    private HashMap<Integer, User> users;


    public BookingService() {
        bookings = new HashMap<>();
        flights = new HashMap<>();
        users = new HashMap<>();
    }

    public User createUser(int userId, String username, String email) {
        if (users.containsKey(userId)) {
            throw new IllegalArgumentException("User Already exists");
        } else {
            User user = new User(userId, username, email);
            users.put(userId, user);
            System.out.println("User created with given details");
            return user;
        }
    }

    public Flight createFLight(int flightId, String source, String destination, String departureTime, String duration, int noOfSeats) {
        if (flights.containsKey(flightId)) {
            throw new IllegalArgumentException("Flight Already exists");
        } else {
            Flight flight = new Flight(flightId, source, destination, departureTime, duration, noOfSeats);
            System.out.println("FLight created with given details");
            flights.put(flightId, flight);
            return flight;
        }
    }

    public Booking createBooking(User user, Flight flight, double amount, int seatsBooked) {
        Booking booking = new Booking(user, flight, amount, seatsBooked);
        int availableSeats = flight.getAvailableSeats();
        if (availableSeats < seatsBooked) {
            throw new IllegalArgumentException("Seats not available");
        } else {
            flight.bookSeat(seatsBooked);
            System.out.println("Booking created with given details");
            bookings.put(user.getUserId(), booking);
            return booking;
        }

    }
}