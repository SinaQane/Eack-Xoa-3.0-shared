package event.events.timeline;

import event.Event;
import event.EventVisitor;
import response.Response;

public class ViewTimelineEvent extends Event
{
    private final long userId;

    public ViewTimelineEvent(Long userId)
    {
        this.userId = userId;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.viewTimeline(userId);
    }
}
