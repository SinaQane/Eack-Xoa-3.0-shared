package event.events.general;

import event.Event;
import event.EventVisitor;
import response.Response;

public class RefreshLastSeenEvent extends Event
{
    private final Long userId;

    public RefreshLastSeenEvent(Long userId)
    {
        this.userId = userId;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.refreshLastSeen(userId);
    }
}
