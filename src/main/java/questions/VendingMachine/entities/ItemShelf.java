package questions.VendingMachine.entities;

public class ItemShelf {
    int code;
    Item item;
    boolean soldOut;

    public int getCode(){
        return this.code;
    }
    public Item getItem(){
        return this.item;
    }
    public boolean isSoldOut(){
        return this.soldOut;
    }
    public void setCode(int code){
        this.code = code;
    }
    public void setItem(Item item){
        this.item = item;
    }
    public void setSoldOut(boolean soldOut){
        this.soldOut = soldOut;
    }
}
