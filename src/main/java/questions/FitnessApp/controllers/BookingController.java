package questions.FitnessApp.controllers;

import questions.FitnessApp.services.BookingService;

public class BookingController {
    private BookingService bookingService;

    public BookingController(BookingService bookingService){
        this.bookingService = bookingService;

    }
    public void bookSession(String username, String centre, String workoutTypeName){
        bookingService.bookSession(username, centre,workoutTypeName);
    }

}
