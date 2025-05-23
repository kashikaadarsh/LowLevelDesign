package questions.FitnessApp.services;

import questions.FitnessApp.models.*;

import java.util.Map;

public class AdminService {
    Map<String, Admin> adminMap;
    Map<String, Centre> centreMap;


    public void registerAdmin(Admin admin){adminMap.put(admin.getAdminName(),admin);}

    public void addCentre(Centre centre){
        centreMap.put(centre.getCenterName(), centre);
    }
    public void addWorkout(Centre centre, WorkoutType workoutType, Slot slot, int availableSLots, int capacity){
        centre.addWorkoutSlot(new WorkoutSlotType(workoutType, slot, availableSLots, capacity));

    }

}
