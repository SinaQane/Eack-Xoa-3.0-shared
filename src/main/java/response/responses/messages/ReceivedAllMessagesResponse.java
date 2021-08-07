package response.responses.messages;

import exceptions.Unauthenticated;
import response.Response;
import response.ResponseVisitor;

public class ReceivedAllMessagesResponse extends Response
{
    private final Unauthenticated err;

    public ReceivedAllMessagesResponse(Unauthenticated err)
    {
        this.err = err;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.receivedAllMessages(err);
    }
}