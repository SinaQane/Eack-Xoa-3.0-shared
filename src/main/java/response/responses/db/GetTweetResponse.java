package response.responses.db;

import exceptions.DatabaseError;
import model.Tweet;
import response.Response;
import response.ResponseVisitor;

public class GetTweetResponse extends Response
{
    private final Tweet tweet;
    private final DatabaseError err;

    public GetTweetResponse(Tweet tweet, DatabaseError err)
    {
        this.tweet = tweet;
        this.err = err;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.getTweet(tweet, err);
    }
}
