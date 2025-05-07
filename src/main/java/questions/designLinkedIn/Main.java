package questions.designLinkedIn;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main( String[] args) {
        LinkedInService linkedInService = new LinkedInService();
        //create Users
        User user1 = linkedInService.createUser("user2", "user1@gmail.com");
        User user2 = linkedInService.createUser("user2", "user2@gmail.com");
        linkedInService.addConnection(user1,user2);
        linkedInService.addConnection(user2,user1);
        Post post1 = linkedInService.createPost(user1, LocalDateTime.now(), "post 1 for user1", new ArrayList<byte[]>());
        linkedInService.addComment(user1,post1, "comment for post1");

    }






}
