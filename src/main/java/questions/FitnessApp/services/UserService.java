package questions.FitnessApp.services;

import questions.FitnessApp.models.User;

import java.util.Map;

public class UserService {
    Map<String, User> userMap;

    public void registerUser(User user){
        userMap.put(user.getUserName(), user);
    }
    public User getUser(String username){
        return userMap.get(username);
    }

}
