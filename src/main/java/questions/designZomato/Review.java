package questions.designZomato;

import java.time.LocalDateTime;

public class Review {
    private String userId;
    private String restaurantId;
    private String description;
    private int stars;
    private LocalDateTime datetime;
    public Review(String userId, String restaurantId,String description,int stars){
        this.userId = userId;
        this.restaurantId = restaurantId;
        this.description = description;
        this.stars = stars;
    }
    public String getReviewDescription(){
        return this.description;
    }
}
