package response.responses.database;

import exceptions.DatabaseError;
import model.Profile;
import model.User;
import response.Response;
import response.ResponseVisitor;

public class GetUserResponse extends Response
{
    private final User user;
    private final Profile profile;
    private final DatabaseError err;

    public GetUserResponse(User user, Profile profile, DatabaseError err)
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