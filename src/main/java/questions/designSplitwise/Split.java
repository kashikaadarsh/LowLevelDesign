package questions.designSplitwise;

public abstract class Split {
    private User user;
    private float amount;
    public Split(User user){
        this.user = user;

    }
    public float getAmount(){
        return this.amount;
    }
    public void setAmount(float amount){
        this.amount = amount;
    }


}
