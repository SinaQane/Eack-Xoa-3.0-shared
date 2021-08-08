package event.events.messages;

import event.Event;
import event.EventVisitor;
import response.Response;

public class AddMemberEvent extends Event
{
    private final Long chatId;
    private final String username;
    private final String authToken;

    public AddMemberEvent(Long chatId, String username, String authToken)
    {
        this.chatId = chatId;
        this.username = username;
        this.authToken = authToken;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.addMember(chatId, username, authToken);
    }
}
