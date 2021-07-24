package response.responses.db;

import model.Message;
import response.Response;
import response.ResponseVisitor;

public class GetMessageResponse extends Response
{
    private final Message message;

    public GetMessageResponse(Message message)
    {
        this.message = message;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.getMessage(message);
    }
}
