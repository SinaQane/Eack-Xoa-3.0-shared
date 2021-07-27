package event.events.authentication;

import event.Event;
import event.EventVisitor;
import response.Response;

public class OfflineLoginEvent extends Event
{
    private final long userId;

    public OfflineLoginEvent(long userId)
    {
        this.userId = userId;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.offlineLogin(userId);
    }
}
