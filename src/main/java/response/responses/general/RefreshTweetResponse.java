package response.responses.general;

import model.Tweet;
import response.Response;
import response.ResponseVisitor;

import java.util.List;

public class RefreshTweetResponse extends Response
{
    private final Tweet tweet;
    private final List<List<Long>> comments;

    public RefreshTweetResponse(Tweet tweet, List<List<Long>> comments)
    {
        this.tweet = tweet;
        this.comments = comments;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.refreshTweet(tweet, comments);
    }
}
