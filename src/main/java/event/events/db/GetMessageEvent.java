package event.events.db;

import event.Event;
import event.EventVisitor;
import response.Response;

public class GetMessageEvent extends Event
{
    private final long id;

    public GetMessageEvent(long id)
    {
        this.id = id;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.getMessage(id);
    }
}