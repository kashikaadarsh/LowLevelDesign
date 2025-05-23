package questions.FitnessApp.services;

import questions.FitnessApp.models.*;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Map;

public class BookingService {
  List<Centre> centres;
  UserService userService;
  Map<String, Centre> centreMap;
  List<Booking> bookingList;
  final int MAX_WEEKLY_LIMIT = 10;

  public void bookSession(String username, String centre, String workoutTypeName){
    User user = userService.getUser(username);
    Centre centres = centreMap.get(centre);
    if(user == null|| centres == null)
      return;
    for( WorkoutSlotType workoutTypeSlot: centres.getWorkoutSlotList()){
      if((workoutTypeSlot.getWorkoutType().getWorkoutType() == workoutTypeName)&& workoutTypeSlot.getCapacity()>0){
        bookingList.add(new Booking(user,centres,workoutTypeSlot));
        System.out.println("Booking confirmed for user "+ user.getUserName());
      }

      System.out.println("Booking not possible ");


    }





  }
}
