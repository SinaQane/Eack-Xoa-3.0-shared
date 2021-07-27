package event.events.general;

import event.Event;
import event.EventVisitor;
import response.Response;

public class ViewUserEvent extends Event
{
    private final long userId;

    public ViewUserEvent(Long userId)
    {
        this.userId = userId;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.viewUser(userId);
    }
}
