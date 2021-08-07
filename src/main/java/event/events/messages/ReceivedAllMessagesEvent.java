package event.events.messages;

import event.Event;
import event.EventVisitor;
import response.Response;

public class ReceivedAllMessagesEvent extends Event
{
    private final Long userId;
    private final String authToken;

    public ReceivedAllMessagesEvent(Long userId, String authToken)
    {
        this.userId = userId;
        this.authToken = authToken;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.receivedAllMessages(userId, authToken);
    }
}
