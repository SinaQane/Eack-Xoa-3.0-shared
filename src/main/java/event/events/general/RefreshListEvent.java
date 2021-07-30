package event.events.general;

import event.Event;
import event.EventVisitor;
import response.Response;

public class RefreshListEvent extends Event
{
    // list can be "followers", "followings" and "blacklist"
    private final String list;
    private final long userId;

    public RefreshListEvent(String list, Long userId)
    {
        this.userId = userId;
        this.list = list;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.refreshList(list, userId);
    }
}
