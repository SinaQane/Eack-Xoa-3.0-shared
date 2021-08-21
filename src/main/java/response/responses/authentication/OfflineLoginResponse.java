package response.responses.authentication;

import model.User;
import response.Response;
import response.ResponseVisitor;

public class OfflineLoginResponse extends Response
{
    private final User user;
    private final String authToken;

    public OfflineLoginResponse(User user, String authToken)
    {
        this.authToken = authToken;
        this.user = user;
    }

    public User getUser()
    {
        return user;
    }

    public String getAuthToken()
    {
        return authToken;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.offlineLogin(user, authToken);
    }
}
