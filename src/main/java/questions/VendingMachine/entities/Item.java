package questions.VendingMachine.entities;

public class Item {
    ItemType type;
    int price;

    public int getPrice(){
        return this.price;
    }
    public ItemType getType(){
        return this.type;
    }
    public void setType(ItemType type){
        this.type=type;
    }
    public void setPrice(int price){
        this.price = price;
    }


}
