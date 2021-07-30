package response.responses.general;

import model.User;
import response.Response;
import response.ResponseVisitor;

import java.util.List;

public class ViewUserResponse extends Response
{
    private final User user;
    private final List<List<Long[]>> tweets;

    public ViewUserResponse(User user, List<List<Long[]>> tweets)
    {
        this.user = user;
        this.tweets = tweets;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.viewUser(user, tweets);
    }
}