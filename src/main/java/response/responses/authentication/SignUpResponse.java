package response.responses.authentication;

import model.User;
import response.Response;
import response.ResponseVisitor;

public class SignUpResponse extends Response
{
    private final User user;
    private final Exception err;

    public SignUpResponse(User user, Exception err)
    {
        this.user = user;
        this.err = err;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.signUp(user, err);
    }
}
