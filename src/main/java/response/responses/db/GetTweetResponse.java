package response.responses.db;

import model.Tweet;
import response.Response;
import response.ResponseVisitor;

public class GetTweetResponse extends Response
{
    private final Tweet tweet;

    public GetTweetResponse(Tweet tweet)
    {
        this.tweet = tweet;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.getTweet(tweet);
    }
}
