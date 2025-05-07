package questions.designTwitter;
import java.util.*;

public class User {
    private int userId;
    private String name;
    private String email;
    private String phoneNumber;
    private Set<User> followers;
    private Set<User> following;
    private Set<Tweet> tweets;

    User(int userId, String name, String email, String phoneNumber){
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.followers = new HashSet<>();
        this.following = new HashSet<>();
        this.tweets = new HashSet<>();

    }

    public int getUserId(){
        return this.userId;
    }
    public String getUserName(){
        return this.name;
    }
    public Set<User> getFollowers(){
        return this.followers;
    }
    public Set<User> getFollowing(){
        return this.following;
    }
    public Set<Tweet> getTweets(){
        return this.tweets;
    }

    public void addFollowers(User follower){
        followers.add(follower);
    }

    public void removeFollowers(User follower){
        followers.remove(follower);
    }

    public void addTweet(Tweet tweet){
        tweets.add(tweet);
    }


}
