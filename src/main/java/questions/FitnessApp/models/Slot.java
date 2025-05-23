package questions.FitnessApp.models;

import java.time.LocalDate;
import java.time.LocalTime;

public class Slot {
    private LocalTime startTime, endTime;
    public Slot(LocalTime startTime, LocalTime endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalTime getSlotStartTime(){return this.startTime;}
    public LocalTime getSlotEndTime(){return this.endTime;}

}
