package event.events.groups;

import event.Event;
import event.EventVisitor;
import response.Response;

public class ViewGroupsPageEvent extends Event
{
    private final Long userId;

    public ViewGroupsPageEvent(Long userId)
    {
        this.userId = userId;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.viewGroupsPage(userId);
    }
}
