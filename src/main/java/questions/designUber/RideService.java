package questions.designUber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RideService {
    Map<String,Rider> riderMap = new HashMap<>();
    Map<String,Driver> driverMap = new HashMap<>();
    Map<String,Ride> rideMap = new HashMap<>();

    public void registerRider(Rider user){
        riderMap.put(user.getRiderId(),user);

    }
    public void registerDriver(Driver driver){
        driverMap.put(driver.getDriverId(),driver);
    }
    public void registerRide(Ride ride){
        rideMap.put(ride.getRideId(),ride);
    }

    public void assignDriverToRide(Ride ride, Driver driver){
        ride.assignDriver(driver);
        System.out.println("Driver assigned as "+ driver.getDriverName());

    }

    public List<Driver> getAvailableDrivers(){
        List<Driver> drivers = new ArrayList<>();
        for(Driver driver: driverMap.values()){
            if(driver.isDriverAvailable())
                drivers.add(driver);
        }
        return drivers;
    }

    public void cancelRide(Ride ride){
        ride.cancellRide();
    }

}
