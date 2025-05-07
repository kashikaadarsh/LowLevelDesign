package questions.designAmazon;

public class Address {
    private int zipcode;
    private String addressLine1;
    private String city;
    private String state;
    private String country;
}

enum OrderStatus{
    UNSHIPPED,
    PENDING,
    SHIPPED,
    CONFIRMED,
    CANCELED,
    REFUNDED
}

enum AccountStatus {
    ACTIVE,
    INACTIVE,
    BLOCKED
}

enum ShipmentStatus {
    PENDING,
    SHIPPED,
    DELIVERED,
    ON_HOLD
}

