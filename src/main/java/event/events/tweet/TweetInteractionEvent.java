package event.events.tweet;

import event.Event;
import event.EventVisitor;
import response.Response;

public class TweetInteractionEvent extends Event
{
    // interaction can be "upvote", "downvote", "retweet", "save" and "report"
    private final String interaction;
    private final String authToken;
    private final long tweetId;
    private final long userId;

    public TweetInteractionEvent(String interaction, Long userId, Long tweetId, String authToken)
    {
        this.userId = userId;
        this.tweetId = tweetId;
        this.authToken = authToken;
        this.interaction = interaction;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.tweetInteraction(interaction, userId, tweetId, authToken);
    }
}
