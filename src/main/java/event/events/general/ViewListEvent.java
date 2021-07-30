package event.events.general;

import event.Event;
import event.EventVisitor;
import response.Response;

public class ViewListEvent extends Event
{
    // list can be "followers", "followings", "blacklist" and "notifications"
    private final String list;
    private final long userId;

    public ViewListEvent(String list, Long userId)
    {
        this.userId = userId;
        this.list = list;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.viewList(list, userId);
    }
}
