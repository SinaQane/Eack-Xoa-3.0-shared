package event.events.settings;

import event.Event;
import event.EventVisitor;
import response.Response;

public class DeleteAccountEvent extends Event
{
    private final boolean online;
    private final long userId;
    private String authToken;

    public DeleteAccountEvent(Long userId, String authToken)
    {
        this.online = true;
        this.userId = userId;
        this.authToken = authToken;
    }

    public DeleteAccountEvent(Long userId)
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
        return eventVisitor.deleteAccount(userId, authToken, online);
    }
}
