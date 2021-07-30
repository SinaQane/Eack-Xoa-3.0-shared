package event.events.tweet;

import event.Event;
import event.EventVisitor;
import response.Response;

public class ForwardTweetEvent extends Event
{
    private final String authToken;
    private final String usernames;
    private final String groups;
    private final long tweetId;

    public ForwardTweetEvent(String authToken, String usernames, String groups, long tweetId)
    {
        this.authToken = authToken;
        this.usernames = usernames;
        this.groups = groups;
        this.tweetId = tweetId;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.forwardTweet(usernames, groups, tweetId, authToken);
    }
}
