package event.events.authentication;

import event.Event;
import event.EventVisitor;
import response.Response;

public class LogoutEvent extends Event
{
    private final long userId;
    private final String authToken;

    public LogoutEvent(long userId, String authToken)
    {
        this.userId = userId;
        this.authToken = authToken;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.logout(userId, authToken);
    }
}
