package questions.designFlightBooking;

public class Booking {
    private int userId;
    private int flightId;
    private double amount;
    private int seatsBooked;
    private String paymentStatus;

    public Booking(User user, Flight flight, double amount, int seatsBooked){
        this.amount = amount;
        this.seatsBooked = seatsBooked;
        this.flightId = flight.getFlightId();
        this.userId = user.getUserId();
        this.paymentStatus = "paymentStatus";
    }

    public int getUser(){
        return this.userId;
    }
    public int getFlightId(){
        return this.flightId;
    }
    public double getAmount(){
        return this.amount;
    }
    public int getSeatsBooked(){
        return this.seatsBooked;
    }
    public String getPaymentStatus(){
        return this.paymentStatus;
    }
}
