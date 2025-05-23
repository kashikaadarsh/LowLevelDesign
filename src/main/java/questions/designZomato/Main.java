package questions.designZomato;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args){
        RestaurantService restaurantService = new RestaurantService();
        OrderService orderService = new OrderService();
        User user1 = new User("kashika","kashika","kashika@1");
        restaurantService.addRestaurant("restaurant","HSR", new ArrayList<MenuItems>());



    }
}
