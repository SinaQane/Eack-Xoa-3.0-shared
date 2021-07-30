package event.events.timeline;

import event.Event;
import event.EventVisitor;
import response.Response;

public class RefreshBookmarksEvent extends Event
{
    private final long userId;

    public RefreshBookmarksEvent(Long userId)
    {
        this.userId = userId;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.refreshBookmarks(userId);
    }
}
