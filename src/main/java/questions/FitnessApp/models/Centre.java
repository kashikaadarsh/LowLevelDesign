package questions.FitnessApp.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Centre {
    private String name, location;
    private LocalDateTime openingTime;
    List<WorkoutSlotType> workoutSlotTypeList;

    public Centre(String name, String location, LocalDateTime openingTime){
        this.name = name;
        this.location = location;
        this.openingTime = openingTime;
        this.workoutSlotTypeList = new ArrayList<>();
    }
    public String getCenterName(){return this.name;}
    public String getCenterLocation(){return this.location;}

    public LocalDateTime getCenterOpeningTime(){return this.openingTime;}

    public void addWorkoutSlot(WorkoutSlotType workoutSlotType){
       this. workoutSlotTypeList.add(workoutSlotType);
    }
    public List<WorkoutSlotType> getWorkoutSlotList(){return this.workoutSlotTypeList;}
}
