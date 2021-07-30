package event.events.explore;

import event.Event;
import event.EventVisitor;
import response.Response;

public class ExplorePageEvent extends Event
{
    private final long userId;

    public ExplorePageEvent(Long userId)
    {
        this.userId = userId;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.explore(userId);
    }
}
