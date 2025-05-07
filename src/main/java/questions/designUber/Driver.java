package questions.designUber;

import java.util.UUID;

public class Driver {
    private final String driverId;
    private final String driverName;
    private final String vehicleNumber;
    private final String vehicleType;
    private boolean isAvailable;
    Driver(String driverName, String vehicleNumber, String vehicleType){
        this.driverId = UUID.randomUUID().toString();
        this.driverName = driverName;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.isAvailable = true;
    }
    public String getDriverName(){return this.driverName;}
    public String getDriverId(){return this.driverId;}
    public String getVehicleNumber(){return this.vehicleNumber;}
    public boolean isDriverAvailable(){return this.isAvailable;}
    public void markDriverAvailable(){this.isAvailable = true;}
    public void markDriverUnavailable(){this.isAvailable = false;}

}
