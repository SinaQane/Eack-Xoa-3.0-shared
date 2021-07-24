package event.events.db;

import event.Event;
import event.EventVisitor;
import response.Response;

public class GetNotificationEvent extends Event
{
    private final long id;

    public GetNotificationEvent(long id)
    {
        this.id = id;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.getNotification(id);
    }
}