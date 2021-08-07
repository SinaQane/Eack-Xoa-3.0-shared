package event.events.messages;

import event.Event;
import event.EventVisitor;
import model.Message;
import response.Response;

import java.util.List;

public class SendCachedMessagesEvent extends Event
{
    private final List<Message> messages;
    private final String authToken;

    public SendCachedMessagesEvent(List<Message> messages, String authToken)
    {
        this.messages = messages;
        this.authToken = authToken;
    }

    @Override
    public Response visit(EventVisitor eventVisitor) {
        return eventVisitor.sendCachedMessages(messages, authToken);
    }
}
