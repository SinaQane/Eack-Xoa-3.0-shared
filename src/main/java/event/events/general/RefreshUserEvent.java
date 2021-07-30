package event.events.general;

import event.Event;
import event.EventVisitor;
import response.Response;

public class RefreshUserEvent extends Event
{
    private final long userId;

    public RefreshUserEvent(Long userId)
    {
        this.userId = userId;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.refreshUser(userId);
    }
}
