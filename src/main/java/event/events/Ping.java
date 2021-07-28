package event.events;

import event.Event;
import event.EventVisitor;
import response.Response;

public class Ping extends Event
{
    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        String ping = "ping";
        return eventVisitor.ping(ping);
    }
}
