package response.responses.general;

import exceptions.Unauthenticated;
import response.Response;
import response.ResponseVisitor;

public class RequestReactionResponse extends Response
{
    private final Unauthenticated err;

    public RequestReactionResponse(Unauthenticated err)
    {
        this.err = err;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.requestReaction(err);
    }
}
