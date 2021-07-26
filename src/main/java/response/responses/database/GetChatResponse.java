package response.responses.database;

import exceptions.DatabaseError;
import model.Chat;
import response.Response;
import response.ResponseVisitor;

public class GetChatResponse extends Response
{
    private final Chat chat;
    private final DatabaseError err;

    public GetChatResponse(Chat chat, DatabaseError err)
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