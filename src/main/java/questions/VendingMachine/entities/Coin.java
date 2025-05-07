package questions.VendingMachine.entities;

public enum Coin {
    PENNY(1),
    NICKEL(5),
    DIME(15),
    QUARTER(25);

    public int value;
    Coin(int value){
        this.value = value;
    }

}
