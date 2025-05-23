package questions.designZomato;
import java.util.HashMap;
import java.util.List;

public class RestaurantService {
    HashMap<String,Restaurant> restaurantListByName;
    HashMap<String, Restaurant> restaurantListByAddress;
    public RestaurantService(){
        HashMap<String,Restaurant> restaurantListByName = new HashMap<>();
        HashMap<String,Restaurant> restaurantListByAddress = new HashMap<>();
    }
    public void addRestaurant(String restaurantName, String address, List<MenuItems> menu){
        Restaurant restaurant = new Restaurant(restaurantName,address,menu);
        this.restaurantListByName.put(restaurantName,restaurant);
        this.restaurantListByAddress.put(restaurantName,restaurant);

    }
    public void addItemToMenu(Restaurant restaurant,MenuItems item){
        restaurant.addItemInRestaurantMenu(item);
    }
    public void removeItemFromMenu(Restaurant restaurant, MenuItems item){

    }

}
