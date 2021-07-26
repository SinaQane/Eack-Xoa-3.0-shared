package response.responses.database;

import exceptions.DatabaseError;
import model.Message;
import response.Response;
import response.ResponseVisitor;

public class GetMessageResponse extends Response
{
    private final Message message;
    private final DatabaseError err;

    public GetMessageResponse(Message message, DatabaseError err)
    {
        this.message = message;
        this.err = err;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.getMessage(message, err);
    }
}
