package response.responses.db;

import model.Chat;
import response.Response;
import response.ResponseVisitor;

public class GetChatResponse extends Response
{
    private final Chat chat;

    public GetChatResponse(Chat chat)
    {
        this.chat = chat;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.getChat(chat);
    }
}