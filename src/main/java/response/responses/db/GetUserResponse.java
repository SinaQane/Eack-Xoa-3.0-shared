package response.responses.db;

import model.Profile;
import model.User;
import response.Response;
import response.ResponseVisitor;

public class GetUserResponse extends Response
{
    private final User user;
    private final Profile profile;
    private final Exception err;

    public GetUserResponse(User user, Profile profile, Exception err)
    {
        this.user = user;
        this.profile = profile;
        this.err = err;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.getUser(user, profile, err);
    }
}