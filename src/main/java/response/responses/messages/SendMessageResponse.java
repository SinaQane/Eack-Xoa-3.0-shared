package response.responses.messages;

import exceptions.Unauthenticated;
import response.Response;
import response.ResponseVisitor;

public class SendMessageResponse extends Response
{
    private final Unauthenticated err;

    public SendMessageResponse(Unauthenticated err)
    {
        this.err = err;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.sendMessage(err);
    }
}
