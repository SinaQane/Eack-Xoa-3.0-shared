package response.responses.general;

import model.User;
import response.Response;
import response.ResponseVisitor;

import java.util.List;

public class RefreshUserResponse extends Response
{
    private final User user;
    private final List<List<Long[]>> tweets;

    public RefreshUserResponse(User user, List<List<Long[]>> tweets)
    {
        this.user = user;
        this.tweets = tweets;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.refreshUser(user, tweets);
    }
}