package response.responses.messages;

import exceptions.Unauthenticated;
import response.Response;
import response.ResponseVisitor;

public class EditMessageResponse extends Response
{
    private final Unauthenticated err;

    public EditMessageResponse(Unauthenticated err)
    {
        this.err = err;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.editMessage(err);
    }
}