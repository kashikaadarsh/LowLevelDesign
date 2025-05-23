package questions.FitnessApp.models;

public class Booking {
    private User user;
    private Centre centre;
    private WorkoutSlotType workoutSlotType;

    public Booking (User user, Centre centre, WorkoutSlotType workoutSlotType){
        this.centre = centre;
        this.user = user;
        this.workoutSlotType = workoutSlotType;
    }

}
