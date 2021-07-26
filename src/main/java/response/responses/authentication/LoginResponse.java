package response.responses.authentication;

import exceptions.authentication.LoginFailed;
import model.User;
import response.Response;
import response.ResponseVisitor;

public class LoginResponse extends Response
{
    private final User user;
    private final LoginFailed err;

    public LoginResponse(User user, LoginFailed err)
    {
        this.user = user;
        this.err = err;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.login(user, err);
    }
}
