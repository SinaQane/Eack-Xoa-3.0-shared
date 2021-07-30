package response.responses.profile;

import model.User;
import response.Response;
import response.ResponseVisitor;

import java.util.List;

public class RefreshProfileResponse extends Response
{
    private final User user;
    private final List<List<Long[]>> tweets;

    public RefreshProfileResponse(User user, List<List<Long[]>> tweets)
    {
        this.user = user;
        this.tweets = tweets;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.refreshProfile(user, tweets);
    }
}
