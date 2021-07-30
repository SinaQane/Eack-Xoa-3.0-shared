package event.events.timeline;

import event.Event;
import event.EventVisitor;
import response.Response;

public class ViewBookmarksEvent extends Event
{
    private final long userId;

    public ViewBookmarksEvent(Long userId)
    {
        this.userId = userId;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.viewBookmarks(userId);
    }
}
