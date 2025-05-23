package questions.FitnessApp.app;

import questions.FitnessApp.controllers.AdminController;
import questions.FitnessApp.controllers.BookingController;
import questions.FitnessApp.controllers.UserController;
import questions.FitnessApp.services.AdminService;
import questions.FitnessApp.services.BookingService;
import questions.FitnessApp.services.UserService;

public class Main {
    public static void main(String [] args){
        AdminService adminService = new AdminService();
        AdminController adminController = new AdminController(adminService);
        BookingService bookingService = new BookingService();
        BookingController bookingController = new BookingController(bookingService);
        UserService userService = new UserService();
        UserController userController = new UserController(userService);

        userController.registerUser("Kashika", "kashika@gmail.com", "Koramangala");
//        adminController.addWorkout("Koramangala", "Cardio", 6, 7, 1 );
        bookingController.bookSession("kashika@gmail.com", "Koramangala", "Cardio");
    }
}
