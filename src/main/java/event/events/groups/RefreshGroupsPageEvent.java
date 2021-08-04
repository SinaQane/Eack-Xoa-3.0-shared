package event.events.groups;

import event.Event;
import event.EventVisitor;
import response.Response;

public class RefreshGroupsPageEvent extends Event
{
    private final Long userId;

    public RefreshGroupsPageEvent(Long userId)
    {
        this.userId = userId;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.refreshGroupsPage(userId);
    }
}
