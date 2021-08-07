package event.events.messages;

import event.Event;
import event.EventVisitor;
import response.Response;

public class RefreshChatroomEvent extends Event
{
    private final Long chatId;

    public RefreshChatroomEvent(Long chatId)
    {
        this.chatId = chatId;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.refreshChatroom(chatId);
    }
}
