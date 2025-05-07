package questions.designLinkedIn;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int userId;
    private String username;
    private int password;
    private String email;
    private List<Experience> experiences;
    private List<User> connections;
    private List<Post> posts;

    User(String username,String email){
        this.username = username;
        this.email = email;
        this.experiences = new ArrayList<Experience>();
        this.connections = new ArrayList<User>();
        this.posts = new ArrayList<Post>();
    }

    public int getUserId(){
        return this.userId;

    }
    public String getEmail(){
        return this.email;
    }
    public List <Experience> getExperiences(){
        return this.experiences;
    }
    public List<User> getConnections(){
        return this.connections;
    }
    public void addExperience(Experience currentExp){
        this.experiences.add(currentExp);
    }
    public void addConnection(User user){
        this.connections.add(user);
    }
    public List<Post> getPosts(){
        return this.posts;
    }

}
