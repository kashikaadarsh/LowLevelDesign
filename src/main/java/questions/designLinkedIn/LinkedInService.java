package questions.designLinkedIn;
import java.time.LocalDateTime;
import java.util.*;
public class LinkedInService {
    private HashMap<Integer,User> users;

    LinkedInService(){
        users = new HashMap<>();
    }

    public User createUser(String name, String email){
        User user = new User(name, email);
        users.put(1,user);
        return user;

    }
    public void addConnection(User user, User newConnection){
        List<User> connection = user.getConnections();
        connection.add(newConnection);
    }
    public void addPost(User user, Post post){
        List<Post> posts = user.getPosts();
        posts.add(post);

    }
    public Post createPost(User creator, LocalDateTime createdAt, String description, List<byte[]> images){
        Post post = new Post(creator,createdAt, description);
        addPost(creator,post);
        System.out.println("Post with description " + post.getdescription() + " added");
        return post;
    }

    public void deletePost(User creator, Post post){
        List<Post> posts = creator.getPosts();
        posts.remove(post);
    }
    public void removeConnection(User creator, User connection){
        List<User> connections = creator.getConnections();
        connections.remove(connection);

    }

    public void addLike(User user, Post post){
        post.addLikes(user);
    }

    public void addComment(User user, Post post, String description){
        Comment comment = new Comment(user, post, description);
        post.addComment(comment);
    }

}
