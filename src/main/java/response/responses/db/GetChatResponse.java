package response.responses.db;

import model.Chat;
import response.Response;
import response.ResponseVisitor;

public class GetChatResponse extends Response
{
    private final Chat chat;
    private final Exception err;

    public GetChatResponse(Chat chat, Exception err)
    {
        this.chat = chat;
        this.err = err;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.getChat(chat, err);
    }
}