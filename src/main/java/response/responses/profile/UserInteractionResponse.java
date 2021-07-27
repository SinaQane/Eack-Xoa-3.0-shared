package response.responses.profile;

import exceptions.Unauthenticated;
import response.Response;
import response.ResponseVisitor;

public class UserInteractionResponse extends Response
{
    private final Unauthenticated err;

    public UserInteractionResponse(Unauthenticated err)
    {
        this.err = err;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.userInteraction(err);
    }
}
