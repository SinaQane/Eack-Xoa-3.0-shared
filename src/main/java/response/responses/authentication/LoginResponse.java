package response.responses.authentication;

import exceptions.authentication.LoginFailed;
import model.User;
import response.Response;
import response.ResponseVisitor;

public class LoginResponse extends Response
{
    private final User user;
    private final String authToken;
    private final LoginFailed err;

    public LoginResponse(User user, String authToken, LoginFailed err)
    {
        this.authToken = authToken;
        this.user = user;
        this.err = err;
    }

    public User getUser()
    {
        return user;
    }

    public String getAuthToken()
    {
        return authToken;
    }

    public LoginFailed getErr()
    {
        return err;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.login(user, authToken, err);
    }
}
