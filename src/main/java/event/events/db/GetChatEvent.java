package event.events.db;

import event.Event;
import event.EventVisitor;
import response.Response;

public class GetChatEvent extends Event
{
    private final long id;

    public GetChatEvent(long id)
    {
        this.id = id;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.getChat(id);
    }
}
