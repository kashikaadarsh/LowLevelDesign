package questions.designLimitedTimeDeal;

import java.sql.SQLOutput;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class DealService {
    private ConcurrentHashMap<String, Deal> dealMap = new ConcurrentHashMap<>();
    public String createDeal(int price, int maxQuantity, LocalTime startTime, LocalTime endTime){
        String dealId = UUID.randomUUID().toString();
        Deal deal = new Deal(dealId,startTime,endTime,price,maxQuantity);
        this.dealMap.put(dealId,deal);
        return dealId;

    }
    public Deal getDeal(String dealId){
        return dealMap.get(dealId);
    }
    public void endDeal(String dealId){
        Deal deal = dealMap.get(dealId);
        if(deal == null || !deal.isActive())
            System.out.println("Deal is not found or already inactive");
        dealMap.remove(dealId);

    }

    public String claimDeal(String dealId, int userId){
        Deal deal = dealMap.get(dealId);
        LocalTime startTime = deal.getStartTime();
        LocalTime endTime = deal.getEndTime();
        Set<Integer> claimedUser  = deal.getClaimedUsers();
        LocalTime time = LocalTime.now();

        if(endTime.isBefore(time)|| startTime.isAfter(time))
            System.out.println("Deal is not valid ");
        if(claimedUser.contains(userId))
            System.out.println("User already claimed the deal");

        if (deal.soldQuantity.get() >= deal.maxQuantity) return "Deal sold out";

        synchronized (deal) {
            if (deal.soldQuantity.get() >= deal.maxQuantity) return "Deal sold out";
            deal.soldQuantity.incrementAndGet();
            deal.claimedUsers.add(userId);
            return "SUCCESS: Claimed for price " + deal.price;
        }

    }

}
