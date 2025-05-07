package questions.designUber;

import java.util.UUID;

enum RideStatus{
    COMPLETED,
    STARTED,
    CANCELLED;
}
public class Ride {
    private Rider rider;
    private String rideId;
    private Driver driver;
    private String origin;
    private String destination;
    private RideStatus rideStatus;

    public Ride(Rider rider, String origin, String destination){
        this.rideId = UUID.randomUUID().toString();
        this.rider = rider;
        this.origin = origin;
        this.destination = destination;
    }
    public String getRideId(){return this.rideId;}
    public void assignDriver(Driver driver){
        this.driver = driver;
        this.driver.markDriverUnavailable();
    }

    public void markRideComplete(){
        this.rideStatus = RideStatus.COMPLETED;
    }
    public void changeRideStatus(RideStatus rideStatus){
        this.rideStatus = rideStatus;

    }
    public void cancellRide(){
        this.rideStatus = RideStatus.CANCELLED;
        if(this.driver!=null){
            driver.markDriverAvailable();
        }
    }

}
