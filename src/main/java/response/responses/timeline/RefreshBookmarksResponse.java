package response.responses.timeline;

import response.Response;
import response.ResponseVisitor;

import java.util.List;

public class RefreshBookmarksResponse extends Response
{
    private final List<List<Long[]>> tweets;

    public RefreshBookmarksResponse(List<List<Long[]>> tweets)
    {
        this.tweets = tweets;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.refreshBookmarks(tweets);
    }
}
