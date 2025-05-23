package questions.designZomato;

import java.util.List;
import java.util.UUID;

public class Restaurant {
    private String restaurantId;
    private String restaurantName;
    private String address;
    private List<MenuItems> menuItems;
    private List<Review> reviews;
    private Boolean isOpen;
    public Restaurant(String restaurantName, String address, List<MenuItems> menu){
        this.restaurantId = UUID.randomUUID().toString();
        this.restaurantName = restaurantName;
        this.address = address;
        this.menuItems = menu;
    }
    public String getRestaurantId(){return this.restaurantId;}
    public void addItemInRestaurantMenu(MenuItems menuItems){
        this.menuItems.add(menuItems);
    }
    public List<MenuItems> getMenu(){
        return this.menuItems;
    }
    public List<Review> getReviews(){
        return this.reviews;
    }
    public void addReview(Review review){this.reviews.add(review);};
}
