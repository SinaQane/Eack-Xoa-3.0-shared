package event.events.messages;

import event.Event;
import event.EventVisitor;
import response.Response;

public class RefreshMessagesPageEvent extends Event
{
    private final Long userId;

    public RefreshMessagesPageEvent(Long userId)
    {
        this.userId = userId;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.refreshMessagesPage(userId);
    }
}
