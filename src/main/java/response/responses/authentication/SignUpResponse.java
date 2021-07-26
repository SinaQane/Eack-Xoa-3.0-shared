package response.responses.authentication;

import exceptions.authentication.SignUpFailed;
import model.User;
import response.Response;
import response.ResponseVisitor;

public class SignUpResponse extends Response
{
    private final User user;
    private final SignUpFailed err;

    public SignUpResponse(User user, SignUpFailed err)
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
