package event.events.messages;

import event.Event;
import event.EventVisitor;
import response.Response;

public class ViewChatroomEvent extends Event
{
    private final Long chatId;

    public ViewChatroomEvent(Long chatId)
    {
        this.chatId = chatId;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.viewChatroom(chatId);
    }
}
