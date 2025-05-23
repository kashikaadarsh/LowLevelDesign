package questions.designUber;

import java.util.List;

public class UberSystemDemo {
    public static void main(String[] args){
        RideService rideService = new RideService();
        Rider rider1 = new Rider("rider1","rider1@gmail.com");
        Rider rider2 = new Rider("rider2","rider2@gmail.com");
        Driver driver1 = new Driver("driver1","vehicle1","CAR");
        Driver driver2 = new Driver("driver2","vehicle2","BIKE");
        Ride ride1 = new Ride(rider1,"HSR","Brookefield");
        rideService.registerRider(rider1);
        rideService.registerRider(rider2);
        rideService.registerDriver(driver1);
        rideService.registerDriver(driver2);
        rideService.registerRide(ride1);
        List<Driver> availableDriver = rideService.getAvailableDrivers();
        System.out.println(availableDriver.get(0).getDriverName());
        rideService.assignDriverToRide(ride1,availableDriver.get(0));
        rideService.cancelRide(ride1);

    }
}
