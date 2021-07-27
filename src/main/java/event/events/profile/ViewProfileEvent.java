package event.events.profile;

import event.Event;
import event.EventVisitor;
import response.Response;

public class ViewProfileEvent extends Event
{
    private final long userId;

    public ViewProfileEvent(Long userId)
    {
        this.userId = userId;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.viewProfile(userId);
    }
}
