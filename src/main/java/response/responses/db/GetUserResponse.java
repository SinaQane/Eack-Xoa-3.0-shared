package response.responses.db;

import model.Profile;
import model.User;
import response.Response;
import response.ResponseVisitor;

public class GetUserResponse extends Response
{
    private final User user;
    private final Profile profile;

    public GetUserResponse(User user, Profile profile)
    {
        this.user = user;
        this.profile = profile;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.getUser(user, profile);
    }
}