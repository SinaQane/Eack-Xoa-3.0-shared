package response.responses.authentication;

import exceptions.authentication.SignUpFailed;
import model.User;
import response.Response;
import response.ResponseVisitor;

public class SignUpResponse extends Response
{
    private final User user;
    private final String authToken;
    private final SignUpFailed err;

    public SignUpResponse(User user, String authToken, SignUpFailed err)
    {
        this.authToken = authToken;
        this.user = user;
        this.err = err;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.signUp(user, authToken, err);
    }
}
