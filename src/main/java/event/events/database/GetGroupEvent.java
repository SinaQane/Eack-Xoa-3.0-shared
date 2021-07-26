package event.events.database;

import event.Event;
import event.EventVisitor;
import response.Response;

public class GetGroupEvent extends Event
{
    private final long id;

    public GetGroupEvent(long id)
    {
        this.id = id;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.getGroup(id);
    }
}