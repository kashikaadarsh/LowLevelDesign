package questions.FitnessApp.controllers;

import questions.FitnessApp.models.User;
import questions.FitnessApp.services.UserService;

public class UserController {
    private UserService userviceService;

    public UserController(UserService userService){
        this.userviceService = userService;
    }
    public void registerUser(String name, String email, String preferredCenter){
        User user = new User(name, email,preferredCenter);
        userviceService.registerUser(user);
    }
    public User getUser(String name){
        return userviceService.getUser(name);
    }
}
