package response.responses.explore;

import response.Response;
import response.ResponseVisitor;

import java.util.List;

public class ExplorePageResponse extends Response
{
    private final List<Long> tweets;

    public ExplorePageResponse(List<Long> tweets)
    {
        this.tweets = tweets;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.explore(tweets);
    }
}
