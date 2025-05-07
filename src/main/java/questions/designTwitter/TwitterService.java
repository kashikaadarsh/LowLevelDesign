package questions.designTwitter;
import java.util.*;

public class TwitterService {

    private Map<Integer, User> users;
    public TwitterService(){
        users = new HashMap<>();
    }

    public User createUser(int userId, String name, String email, String phoneNumber){

        if(users.containsKey(userId)){
            throw new IllegalArgumentException("User already exists");
        }
        User user = new User(userId,name, email, phoneNumber);
        users.put(userId,user);
        return user;
    }

    public void addfollower(User user, User follower){
        Set<User> currFollowers = user.getFollowers();
        if(currFollowers.contains(follower)){
            throw new IllegalArgumentException("Follower already present!!");
        }
        currFollowers.add(follower);
    }
    public void addfollowing(User user, User follower){
        Set<User> currFollowing = user.getFollowing();
        if(currFollowing.contains(follower)){
            throw new IllegalArgumentException("Already following!!");
        }
        currFollowing.add(follower);
        System.out.println(currFollowing);
    }

    public void postTweet(User user, String message){
        Tweet tweet = new Tweet(user.getUserId(),message);
        System.out.println("Inside post tweet function");
        user.addTweet(tweet);
    }

    public void viewTimeline(User user){
        System.out.println(" Timeline of user ");
        System.out.println(user.getUserName());
        Set<User> followingUsers = user.getFollowing();
        for( User following: followingUsers){
            System.out.println("inside viewTimeline");
            for(Tweet tweet: following.getTweets()){
                System.out.println(tweet.getDescription());

            }
        }

    }

}
