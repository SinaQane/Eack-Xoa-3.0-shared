package response.responses.timeline;

import response.Response;
import response.ResponseVisitor;

import java.util.List;

public class RefreshTimelineResponse extends Response
{
    private final List<List<Long[]>> tweets;

    public RefreshTimelineResponse(List<List<Long[]>> tweets)
    {
        this.tweets = tweets;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.refreshTimeline(tweets);
    }
}