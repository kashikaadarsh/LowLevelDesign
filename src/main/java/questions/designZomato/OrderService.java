package questions.designZomato;

import java.util.HashMap;
import java.util.List;

public class OrderService {
    HashMap<String,Order> orderList;
    public OrderService(){HashMap<String, Order> orderList = new HashMap<>();}

    public void createOrder(String username, List<MenuItems> orderItems){
        Order order = new Order(username,orderItems);
        this.orderList.put(order.getOrderId(),order);

    }
    public void changeOrderStatus(Order order, OrderStatus orderStatus){
        order.updateOrderStatus(orderStatus);
    }
    public Order fetchOrderDetails(String orderId){
        return this.orderList.get(orderId);
    }
}
