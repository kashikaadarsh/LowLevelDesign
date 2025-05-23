package questions.FitnessApp.controllers;
import questions.FitnessApp.models.*;
import questions.FitnessApp.services.AdminService;
public class AdminController {
    private AdminService adminService;

    public AdminController(AdminService adminService){
        this.adminService = adminService;
    }
    public void registerAdmin(Admin admin) {
        this.adminService.registerAdmin(admin);
    }
    public void addCentre(Centre centre){
        adminService.addCentre(centre);
    }
    public void addWorkout(String centerName, String typeName, int startHour, int endHour, int capacity, String startDate, String endDate) {
//        adminService.addWorkout(centerName, typeName, startHour, endHour, capacity);
    }

}
