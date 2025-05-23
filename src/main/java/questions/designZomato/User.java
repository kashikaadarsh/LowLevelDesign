package questions.designZomato;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    private String userId;
    private String username;
    private String password;
    private String email;
    List<Order> orderHistory;
    public User(String username, String password, String email){
        this.userId = UUID.randomUUID().toString();
        this.username = username;
        this.password = password;
        this.email = email;
        this.orderHistory = new ArrayList<Order>();

    }
    public String getUserId(){return this.userId;}
    public String getName(){return this.username;}
    public String getEmail(){return this.email;}
}
