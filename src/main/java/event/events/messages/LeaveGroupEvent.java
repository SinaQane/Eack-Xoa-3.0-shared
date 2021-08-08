package event.events.messages;

import event.Event;
import event.EventVisitor;
import response.Response;

public class LeaveGroupEvent extends Event
{
    private final Long chatId;
    private final String authToken;

    public LeaveGroupEvent(Long chatId, String authToken)
    {
        this.chatId = chatId;
        this.authToken = authToken;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.leaveGroup(chatId, authToken);
    }
}
