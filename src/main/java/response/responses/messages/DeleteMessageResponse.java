package response.responses.messages;

import exceptions.Unauthenticated;
import response.Response;
import response.ResponseVisitor;

public class DeleteMessageResponse extends Response
{
    private final Unauthenticated err;

    public DeleteMessageResponse(Unauthenticated err)
    {
        this.err = err;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.deleteMessage(err);
    }
}