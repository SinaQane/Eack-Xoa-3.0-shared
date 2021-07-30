package event.events.general;

import event.Event;
import event.EventVisitor;
import response.Response;

public class RefreshTweetEvent extends Event
{
    private final long tweetId;

    public RefreshTweetEvent(Long tweetId)
    {
        this.tweetId = tweetId;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.refreshTweet(tweetId);
    }
}
