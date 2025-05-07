package questions.designTwitter;

public class Main {

    public static void main( String[] args){

        TwitterService twitterService = new TwitterService();
        User alice = twitterService.createUser(1, "Alice", "alice@abc.com", "2132412");
        User bob = twitterService.createUser(2, "Bob", "bob@abc.com", "24535352412");

        twitterService.addfollower(alice, bob);
        twitterService.addfollower(bob,alice);

        twitterService.addfollowing(alice, bob);
        twitterService.addfollowing(bob,alice);

        twitterService.postTweet(alice, "This is Alice's first tweet");
        twitterService.postTweet(alice, "This is Alice's second tweet");

        twitterService.postTweet(bob, "This is Bob's first tweet");
        twitterService.postTweet(bob, "This is Bob's second tweet");

        twitterService.viewTimeline(alice);
        twitterService.viewTimeline(bob);

    }
}
