package questions.designLimitedTimeDeal;
import java.time.LocalTime;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.*;

public class Deal {
    String dealId;
    int price;
    int maxQuantity;
    AtomicInteger soldQuantity;
    LocalTime startTime;
    LocalTime endTime;
    Set<Integer> claimedUsers;
    boolean isActive;

    public Deal(String dealId, LocalTime startTime, LocalTime endTime, int cost, int maxQuantity){
        this.startTime = startTime;
        this.endTime = endTime;
        this.price = cost;
        this.maxQuantity = maxQuantity;
        this.soldQuantity = new AtomicInteger(0);
        this.dealId = dealId;
        this.isActive = true;
    }
    public boolean isActive(){
        return this.isActive;
    }
    public Set<Integer> getClaimedUsers(){
        return this.claimedUsers;
    }

    public LocalTime getStartTime(){return this.startTime;}
    public LocalTime getEndTime(){return this.endTime;}





}
