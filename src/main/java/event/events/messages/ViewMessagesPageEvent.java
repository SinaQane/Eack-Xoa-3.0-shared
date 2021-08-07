package event.events.messages;

import event.Event;
import event.EventVisitor;
import response.Response;

public class ViewMessagesPageEvent extends Event
{
    private final Long userId;

    public ViewMessagesPageEvent(Long userId)
    {
        this.userId = userId;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.viewMessagesPage(userId);
    }
}