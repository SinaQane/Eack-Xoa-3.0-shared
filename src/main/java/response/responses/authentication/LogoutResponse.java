package response.responses.authentication;

import exceptions.Unauthenticated;
import exceptions.authentication.LogoutFailed;
import response.Response;
import response.ResponseVisitor;

public class LogoutResponse extends Response
{
    private final LogoutFailed logoutErr;
    private final Unauthenticated authErr;

    public LogoutResponse(LogoutFailed logoutErr, Unauthenticated authErr)
    {
        this.authErr = authErr;
        this.logoutErr = logoutErr;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.logout(logoutErr, authErr);
    }
}
