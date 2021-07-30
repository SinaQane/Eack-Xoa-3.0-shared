package response.responses.tweet;

import exceptions.Unauthenticated;
import exceptions.tweet.ForwardFailed;
import response.Response;
import response.ResponseVisitor;

public class ForwardTweetResponse extends Response
{
    private final Unauthenticated authErr;
    private final ForwardFailed forwardErr;

    public ForwardTweetResponse(ForwardFailed forwardErr, Unauthenticated authErr)
    {
        this.authErr = authErr;
        this.forwardErr = forwardErr;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.forwardTweet(forwardErr, authErr);
    }
}
