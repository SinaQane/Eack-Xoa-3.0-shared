package response.responses.db;

import model.Message;
import response.Response;
import response.ResponseVisitor;

public class GetMessageResponse extends Response
{
    private final Message message;
    private final Exception err;

    public GetMessageResponse(Message message, Exception err)
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
