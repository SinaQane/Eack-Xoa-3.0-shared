package response.responses.timeline;

import response.Response;
import response.ResponseVisitor;

import java.util.List;

public class ViewBookmarksResponse extends Response
{
    private final List<List<Long[]>> tweets;

    public ViewBookmarksResponse(List<List<Long[]>> tweets)
    {
        this.tweets = tweets;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.viewBookmarks(tweets);
    }
}
