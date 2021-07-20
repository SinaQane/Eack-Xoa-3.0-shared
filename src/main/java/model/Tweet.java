package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Tweet
{
    // Tweet info

    // id is the id of the tweet in the database (unique)
    private final long id;

    // owner is the id of the tweet's owner in the database
    private final long owner;

    // upperTweetId is the id of the tweet's parent tweet (-1 if non-existent)
    private long upperTweet = -1;

    // base64Picture is the picture linked to the tweet converted into base64 binary form
    private final String base64Picture;

    // visible indicates that is this tweet deleted or not
    private boolean visible = true;

    private final String text;
    private final Date tweetDate = new Date();

    // Interactions of users with this tweet

    private final List<Long> comments = new LinkedList<>();
    private final List<Long> upvotes = new ArrayList<>();
    private final List<Long> downvotes = new ArrayList<>();
    private final List<Long> retweets = new ArrayList<>();
    private int reports = 0;

    // Constructor

    public Tweet(long id, long owner, String text, String base64Picture)
    {
        this.id = id;
        this.owner = owner;
        this.text = text;
        this.base64Picture = base64Picture;
    }

    // Getters

    public long getId()
    {
        return id;
    }

    public long getOwner()
    {
        return owner;
    }

    public long getUpperTweet()
    {
        return upperTweet;
    }

    public String getText()
    {
        return text;
    }

    public String getPicture()
    {
        return base64Picture;
    }

    public Date getTweetDate()
    {
        return tweetDate;
    }

    public boolean isVisible()
    {
        return visible;
    }

    public List<Long> getComments()
    {
        return this.comments;
    }

    public List<Long> getUpvotes()
    {
        return upvotes;
    }

    public List<Long> getDownvotes()
    {
        return downvotes;
    }

    public List<Long> getRetweets()
    {
        return retweets;
    }

    public int getReports()
    {
        return reports;
    }

    // Setters

    public void setUpperTweet(long upperTweet)
    {
        this.upperTweet = upperTweet;
    }

    public void addComment(Tweet comment)
    {
        this.comments.add(comment.getId());
    }

    public void addUpvote(User user)
    {
        this.upvotes.add(user.getId());
    }

    public void removeUpvote(User user)
    {
        this.upvotes.remove(user.getId());
    }

    public void addDownvote(User user)
    {
        this.downvotes.add(user.getId());
    }

    public void removeDownvote(User user)
    {
        this.downvotes.remove(user.getId());
    }

    public void addRetweet(User user)
    {
        this.retweets.add(user.getId());
    }

    public void removeRetweet(User user)
    {
        this.retweets.remove(user.getId());
    }

    public void addReport()
    {
        this.reports++;
    }

    public void deleteTweet()
    {
        this.visible = false;
    }
}
