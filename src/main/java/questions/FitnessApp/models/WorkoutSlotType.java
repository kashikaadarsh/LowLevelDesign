package questions.FitnessApp.models;

public class WorkoutSlotType {
    private WorkoutType workoutType;
    private Slot slot;
    private int capacity;
    private int availableSlots;

    public WorkoutSlotType(WorkoutType workoutType, Slot slot, int capacity, int availableSlots){
        this.workoutType = workoutType;
        this.slot = slot;
        this.capacity = capacity;
        this.availableSlots = availableSlots;
    }

    public WorkoutType getWorkoutType(){return this.workoutType;}
    public Slot getSlot(){return this.slot;}
    public int getCapacity(){return this.capacity;}
    public int getAvailableSlots(){return this.availableSlots;}
}
