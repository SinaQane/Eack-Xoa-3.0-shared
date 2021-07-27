package event.events.profile;

import event.Event;
import event.EventVisitor;
import response.Response;

public class RefreshProfileEvent extends Event
{
    private final long userId;

    public RefreshProfileEvent(Long userId)
    {
        this.userId = userId;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.refreshProfile(userId);
    }
}
