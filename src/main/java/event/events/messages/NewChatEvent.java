package event.events.messages;

import event.Event;
import event.EventVisitor;
import response.Response;

public class NewChatEvent extends Event
{
    private final String username;
    private final String chatName;
    private final String authToken;

    public NewChatEvent(String username, String chatName, String authToken)
    {
        this.username = username;
        this.chatName = chatName;
        this.authToken = authToken;
    }

    @Override
    public Response visit(EventVisitor eventVisitor) {
        return eventVisitor.newChat(username, chatName, authToken);
    }
}