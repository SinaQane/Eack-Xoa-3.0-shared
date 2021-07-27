package response.responses.tweet;

import exceptions.Unauthenticated;
import response.Response;
import response.ResponseVisitor;

public class TweetInteractionResponse extends Response
{
    private final Unauthenticated err;

    public TweetInteractionResponse(Unauthenticated err)
    {
        this.err = err;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.tweetInteraction(err);
    }
}
