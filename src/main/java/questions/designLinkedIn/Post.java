package questions.designLinkedIn;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private int postId;
    private User creator;
    private LocalDateTime createdAt;
    private String description;
    private List<byte[]> images;

    private List<User> likes;
    private List<Comment> comments;

    Post(User creator, LocalDateTime createdAt, String description){
        this.creator = creator;
        this.createdAt = createdAt;
        this.description = description;
        this.images = new ArrayList<byte []>();
        this.likes = new ArrayList<User>();
        this.comments = new ArrayList<Comment>();
    }

    public int getPostId(){
        return postId;
    }
    public User getCreator(){
        return creator;
    }
    public LocalDateTime getTimeStamp(){
        return createdAt;
    }
    public String getdescription(){
        return description;
    }
    public List<byte[]> getImages(){
        return images;
    }

    public Integer getLikes(){
        return likes.size();
    }

    public void addLikes(User user){
        this.likes.add(user);

    }
    public void addComment(Comment comment){
        System.out.println("Comment "+ comment.getDescription() + " added");
        this.comments.add(comment);

    }

}
