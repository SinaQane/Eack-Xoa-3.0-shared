package response.responses.general;

import exceptions.Unauthenticated;
import response.Response;
import response.ResponseVisitor;

public class SendTweetResponse extends Response
{
    private final Unauthenticated err;

    public SendTweetResponse(Unauthenticated err)
    {
        this.err = err;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.sendTweet(err);
    }
}
