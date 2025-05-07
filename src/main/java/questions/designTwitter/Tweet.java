package questions.designTwitter;

import java.time.LocalDateTime;

public class Tweet {
    private int tweetId;
    private int userId;
    private LocalDateTime timestamp;
    private String description;
    Tweet( int userId, String description) {
        this.userId = userId;
        this.description = description;
        this.timestamp = LocalDateTime.now();

    }

    public int getAuthor(){
        return this.userId;
    }
    public String getDescription(){
        System.out.println(this.description);
        return this.description;
    }

}
