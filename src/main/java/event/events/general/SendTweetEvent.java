package event.events.general;

import event.Event;
import event.EventVisitor;
import response.Response;

public class SendTweetEvent extends Event
{
    private final long userId;
    private final long upperTweet;
    private final String tweet;
    private final String picture;
    private final String authToken;

    public SendTweetEvent(long userId, long upperTweet, String tweet, String picture, String authToken)
    {
        this.userId = userId;
        this.upperTweet = upperTweet;
        this.tweet = tweet;
        this.picture = picture;
        this.authToken = authToken;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.sendTweet(userId, upperTweet, tweet, picture, authToken);
    }
}
