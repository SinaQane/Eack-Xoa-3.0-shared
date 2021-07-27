package event.events.general;

import event.Event;
import event.EventVisitor;
import response.Response;

public class ViewTweetEvent extends Event
{
    private final long tweetId;

    public ViewTweetEvent(Long tweetId)
    {
        this.tweetId = tweetId;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.viewTweet(tweetId);
    }
}
