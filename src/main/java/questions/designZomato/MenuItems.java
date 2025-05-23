package questions.designZomato;

import java.util.UUID;

public class MenuItems {
    private String itemId;
    private String itemName;
    private String description;
    private Boolean isAvailable;
    private double amount;

    public MenuItems(String itemName, String description, Boolean isAvailable, double amount){
        this.itemId = UUID.randomUUID().toString();
        this.itemName = itemName;
        this.description = description;
        this.isAvailable = true;
        this.amount = amount;
    }
    public void updateAmount(double amount){this.amount = amount;}
    public double getAmount(){return this.amount;}
    public Boolean getIsAvailable(){return this.isAvailable;}
    public void markUnAvailable(){this.isAvailable = false;}
    public void markAvailable(){this.isAvailable = true;}

}
