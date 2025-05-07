package questions.designAmazon;

import java.util.List;

public abstract class Account {
    private String name;
    private int phoneNumber;
    private String password;
    private String email;
    private List<Address> shippingAddress;
    private List<CreditCards> creditCards;
    public abstract Address getShippingAddress();
    public abstract boolean addProduct();
    public abstract boolean removeProduct();
    public abstract boolean changePassword();

}
