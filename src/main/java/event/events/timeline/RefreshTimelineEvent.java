package event.events.timeline;

import event.Event;
import event.EventVisitor;
import response.Response;

public class RefreshTimelineEvent extends Event
{
    private final long userId;

    public RefreshTimelineEvent(Long userId)
    {
        this.userId = userId;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.refreshTimeline(userId);
    }
}
