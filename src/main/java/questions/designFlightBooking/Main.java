package questions.designFlightBooking;

import java.awt.print.Book;

public class Main {

    public static void main(String [] args){

        BookingService bookingService = new BookingService();
        User user1 = bookingService.createUser(1,"user1", "user1email@gmail.com");
        User user2 = bookingService.createUser(2,"user2", "user2email@gmail.com");
        Flight flight1 = bookingService.createFLight(1,"bengaluru","delhi", "13232", "3", 100);
        Booking booking1 = bookingService.createBooking(user1,flight1,2345.90, 2);
//        bookingService.createBooking(user1, flight1, 2415.24, 44);



    }
}
