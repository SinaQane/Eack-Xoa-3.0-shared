package response.responses.messages;

import response.Response;
import response.ResponseVisitor;

import java.util.List;

public class RefreshChatroomResponse extends Response
{
    private final List<Long> messages;
    private final Long chatId;

    public RefreshChatroomResponse(List<Long> messages, Long chatId)
    {
        this.messages = messages;
        this.chatId = chatId;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.refreshChatroom(messages, chatId);
    }
}
