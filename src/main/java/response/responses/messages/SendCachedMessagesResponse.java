package response.responses.messages;

import exceptions.Unauthenticated;
import response.Response;
import response.ResponseVisitor;

public class SendCachedMessagesResponse extends Response
{
    private final Unauthenticated err;

    public SendCachedMessagesResponse(Unauthenticated err)
    {
        this.err = err;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.sendCachedMessages(err);
    }
}