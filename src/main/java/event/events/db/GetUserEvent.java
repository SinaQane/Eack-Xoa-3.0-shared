package event.events.db;

import event.Event;
import event.EventVisitor;
import response.Response;

public class GetUserEvent extends Event
{
    private final long id;

    public GetUserEvent(long id)
    {
        this.id = id;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.getUser(id);
    }
}