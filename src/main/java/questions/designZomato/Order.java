package questions.designZomato;

import java.util.List;
import java.util.UUID;

enum OrderStatus{
    CREATED,
    PREPARED,
    SHIPPED,
    OUT_FOR_DELIVERY,
    DELIVERED


}

public class Order {
    private String orderId;
    private String userId;
    private String username;
    private String restaurantID;
    private List<MenuItems> orderItems;
    private OrderStatus orderStatus;
    public Order(String username, List<MenuItems> orderItems){
        String orderId = UUID.randomUUID().toString();
        this.username = username;
        this.orderItems = orderItems;
        this.orderStatus = OrderStatus.CREATED;
    }
    public String getOrderId(){return this.orderId;}
    public void updateOrderStatus(OrderStatus newOrderStatus){
        this.orderStatus = newOrderStatus;
    }
}
