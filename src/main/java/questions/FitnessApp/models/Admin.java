package questions.FitnessApp.models;

public class Admin {
    private String name, email, location;
    public Admin(String name, String email, String location){
        this.name = name;
        this.location = location;
        this.email = email;

    }
    public String getAdminName(){return this.name;}
}
