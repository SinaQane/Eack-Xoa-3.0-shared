package event.events.db;

import event.Event;
import event.EventVisitor;
import response.Response;

public class GetTweetEvent extends Event
{
    private final long id;

    public GetTweetEvent(long id)
    {
        this.id = id;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.getTweet(id);
    }
}