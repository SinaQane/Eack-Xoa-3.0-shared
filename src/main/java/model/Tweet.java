package model;

import constants.SharedConstants;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Tweet
{
    private Long id = -1L;
    private Long owner = -1L;
    private int reports = 0;
    private String text = "";
    private Date tweetDate;

    // upperTweetId is the id of the tweet's parent tweet (-1 if non-existent)
    private Long upperTweet = -1L;
    // base64Picture is the picture linked to the tweet converted into base64 binary form
    private String base64Picture = "";
    // visible indicates that is this tweet deleted or not
    private boolean visible = true;

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
        if (tweetDate == null)
        {
            return new Date(SharedConstants.DEFAULT_DATE);
        }
        return tweetDate;
    }

    public void setTweetDate(Date tweetDate)
    {
        this.tweetDate = tweetDate;
    }

    public List<Long> getComments()
    {
        return comments;
    }

    public void setComments(List<Long> comments)
    {
        this.comments = comments;
    }

    public void addComment(Long comment)
    {
        comments.add(comment);
    }

    public List<Long> getUpvotes()
    {
        return upvotes;
    }

    public void setUpvotes(List<Long> upvotes)
    {
        this.upvotes = upvotes;
    }

    public void addUpvote(Long user)
    {
        upvotes.add(user);
    }

    public void removeUpvote(Long user)
    {
        upvotes.remove(user);
    }

    public List<Long> getDownvotes()
    {
        return downvotes;
    }

    public void setDownvotes(List<Long> downvotes)
    {
        this.downvotes = downvotes;
    }

    public void addDownvote(Long user)
    {
        downvotes.add(user);
    }

    public void removeDownvote(Long user)
    {
        downvotes.remove(user);
    }

    public List<Long> getRetweets()
    {
        return retweets;
    }

    public void setRetweets(List<Long> retweets)
    {
        this.retweets = retweets;
    }

    public void addRetweet(Long user)
    {
        retweets.add(user);
    }

    public void removeRetweet(Long user)
    {
        retweets.remove(user);
    }

    public int getReports()
    {
        return reports;
    }

    public void setReports(int reports)
    {
        this.reports = reports;
    }

    public void addReport()
    {
        this.reports++;
    }

    public boolean isVisible()
    {
        return visible;
    }

    public void setVisible(boolean visible)
    {
        this.visible = visible;
    }

    public void deleteTweet()
    {
        visible = false;
    }
}
