package questions.designFlightBooking;

import java.time.LocalDateTime;

public class Flight {
    private int flightId;
    private String source;
    private String destination;

    private String departureTime;
    private String duration;
    private int noOfSeats;
    private int availableSeats;

    Flight(int flightId, String source, String destination, String departureTime, String duration, int noOfSeats){
        this.flightId = flightId;
        this.source = source;
        this.destination = destination;
        this.departureTime = departureTime;
        this.duration = duration;
        this.noOfSeats = noOfSeats;
        this.availableSeats = noOfSeats;

    }

    public int getFlightId(){
        return this.flightId;
    }
    public String getSource(){
        return this.source;
    }
    public String getDestination(){
        return this.destination;
    }

    public String getDepartureTime(){
        return this.departureTime;
    }

    public String getDuration(){
        return this.duration;
    }

    public int getAvailableSeats(){
        return this.availableSeats;
    }

    public void bookSeat(int cnt){
        if(this.availableSeats < cnt)
            throw new IllegalArgumentException("Seats not available");
        else{
            this.availableSeats-=cnt;
        }
    }
}
