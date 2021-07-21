package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Tweet
{
    private Long id;
    private Long owner;
    private int reports;
    private String text;
    private Date tweetDate;

    // upperTweetId is the id of the tweet's parent tweet (-1 if non-existent)
    private Long upperTweet;
    // base64Picture is the picture linked to the tweet converted into base64 binary form
    private String base64Picture;
    // visible indicates that is this tweet deleted or not
    private boolean visible;

    private List<Long> comments = new LinkedList<>();
    private List<Long> upvotes = new ArrayList<>();
    private List<Long> downvotes = new ArrayList<>();
    private List<Long> retweets = new ArrayList<>();

    public Tweet() {}

    public Tweet(User owner, String text, String base64Picture)
    {
        this.base64Picture = base64Picture;
        this.owner = owner.getId();
        this.text = text;
        tweetDate = new Date();
        upperTweet = -1L;
        visible = true;
        reports = 0;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getOwner()
    {
        return owner;
    }

    public void setOwner(Long owner)
    {
        this.owner = owner;
    }

    public Long getUpperTweet()
    {
        return upperTweet;
    }

    public void setUpperTweet(Long upperTweet)
    {
        this.upperTweet = upperTweet;
    }

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    public String getPicture()
    {
        return base64Picture;
    }

    public void setPicture(String base64Picture)
    {
        this.base64Picture = base64Picture;
    }

    public Date getTweetDate()
    {
        return tweetDate;
    }

    public void setTweetDate(Date tweetDate)
    {
        this.tweetDate = tweetDate;
    }

    public List<Long> getComments()
    {
        return this.comments;
    }

    public void setComments(List<Long> comments)
    {
        this.comments = comments;
    }

    public void addComment(Tweet comment)
    {
        this.comments.add(comment.getId());
    }

    public List<Long> getUpvotes()
    {
        return upvotes;
    }

    public void setUpvotes(List<Long> upvotes)
    {
        this.upvotes = upvotes;
    }

    public void addUpvote(User user)
    {
        this.upvotes.add(user.getId());
    }

    public void removeUpvote(User user)
    {
        this.upvotes.remove(user.getId());
    }

    public List<Long> getDownvotes()
    {
        return downvotes;
    }

    public void setDownvotes(List<Long> downvotes)
    {
        this.downvotes = downvotes;
    }

    public void addDownvote(User user)
    {
        this.downvotes.add(user.getId());
    }

    public void removeDownvote(User user)
    {
        this.downvotes.remove(user.getId());
    }

    public List<Long> getRetweets()
    {
        return retweets;
    }

    public void setRetweets(List<Long> retweets)
    {
        this.retweets = retweets;
    }

    public void addRetweet(User user)
    {
        this.retweets.add(user.getId());
    }

    public void removeRetweet(User user)
    {
        this.retweets.remove(user.getId());
    }

    public int getReports()
    {
        return reports;
    }

    public void addReport()
    {
        this.reports++;
    }

    public boolean isVisible()
    {
        return visible;
    }

    public void deleteTweet()
    {
        this.visible = false;
    }
}
