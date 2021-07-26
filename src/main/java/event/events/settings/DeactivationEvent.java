package event.events.settings;

import event.Event;
import event.EventVisitor;
import response.Response;

public class DeactivationEvent extends Event
{
    private final boolean online;
    private final long userId;
    private String authToken;

    public DeactivationEvent(Long userId, String authToken)
    {
        this.online = true;
        this.userId = userId;
        this.authToken = authToken;
    }

    public DeactivationEvent(Long userId)
    {
        this.online = false;
        this.userId = userId;
    }

    public void setAuthToken(String authToken)
    {
        this.authToken = authToken;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.deactivate(userId, authToken, online);
    }
}
