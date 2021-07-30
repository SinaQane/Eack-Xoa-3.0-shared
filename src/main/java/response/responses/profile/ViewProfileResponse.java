package response.responses.profile;

import model.User;
import response.Response;
import response.ResponseVisitor;

import java.util.List;

public class ViewProfileResponse extends Response
{
    private final User user;
    private final List<List<Long[]>> tweets;

    public ViewProfileResponse(User user, List<List<Long[]>> tweets)
    {
        this.user = user;
        this.tweets = tweets;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.viewProfile(user, tweets);
    }
}
