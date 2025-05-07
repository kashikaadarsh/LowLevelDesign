package questions.designLinkedIn;

public class Comment {
    private int commentId;
    private Post post;
    private User creatorId;
    private String description;

    Comment(User creator, Post post, String description){
        this.post = post;
        this.description = description;
        this.creatorId = creator;

    }
    public int getCommentId(){
        return commentId;
    }
    public Post getPostId(){
        return post;
    }
    public String getDescription(){
        return description;
    }

}
