package event.events.general;

import java.util.EventObject;

public class SendTweetForm extends EventObject
{
    private final long userId;
    private final long upperTweet;
    private final String tweet;
    private final String picture;
    private final String authToken;

    public SendTweetForm(Object source, long userId, long upperTweet, String tweet, String picture, String authToken)
    {
        super(source);
        this.userId = userId;
        this.upperTweet = upperTweet;
        this.tweet = tweet;
        this.picture = picture;
        this.authToken = authToken;
    }

    public long getUserId()
    {
        return userId;
    }

    public long getUpperTweet()
    {
        return upperTweet;
    }

    public String getTweet()
    {
        return tweet;
    }

    public String getPicture()
    {
        return picture;
    }

    public String getAuthToken()
    {
        return authToken;
    }
}
