package event.events.messages;

import event.Event;
import event.EventVisitor;
import response.Response;

public class DeleteMessageEvent extends Event
{
    private final long messageId;
    private final String authToken;

    public DeleteMessageEvent(long messageId, String authToken)
    {
        this.messageId = messageId;
        this.authToken = authToken;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.deleteMessage(messageId, authToken);
    }
}
