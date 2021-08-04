package model;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Profile
{
    private Long id;
    private Date lastSeen = new Date();

    private List<Long> followers = new LinkedList<>();
    private List<Long> followings = new LinkedList<>();
    private List<Long> blocked = new LinkedList<>();
    private List<Long> muted = new LinkedList<>();
    private List<Long> requests = new LinkedList<>();
    private List<Long> pending = new LinkedList<>();

    private List<Long> userTweets = new LinkedList<>();
    private List<Long> retweetedTweets = new LinkedList<>();
    private List<Long> upvotedTweets = new LinkedList<>();
    private List<Long> downvotedTweets = new LinkedList<>();
    private List<Long> reportedTweets = new LinkedList<>();
    private List<Long> savedTweets = new LinkedList<>();

    private List<Long> notifications = new LinkedList<>();
    private List<Long> groups = new LinkedList<>();
    private List<Long> chats = new LinkedList<>();

    // base64Picture is the profile picture converted into base64 binary form
    private String base64Picture = "";

    // privateState is "true" if the page is private and "false" if if it's public.
    private boolean privateState = false;
    // infoState is for Email, Phone number and Birthdate. "true" for public and "false" for private.
    private boolean infoState = false;
    // lastSeenState is "0" for no one, "1" for followings only and "2" for everyone.
    private int lastSeenState = 1;

    public Profile() {}

    Profile(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getPicture()
    {
        return base64Picture;
    }

    public void setPicture(String base64Picture)
    {
        this.base64Picture = base64Picture;
    }

    public Date getLastSeen()
    {
        return lastSeen;
    }

    public void setLastSeen(Date lastSeen)
    {
        this.lastSeen = lastSeen;
    }

    public int getLastSeenState()
    {
        return lastSeenState;
    }

    public void setLastSeenState(int lastSeenState)
    {
        this.lastSeenState = lastSeenState;
    }

    public boolean isPrivate()
    {
        return privateState;
    }

    public void setPrivateState(boolean privateState)
    {
        this.privateState = privateState;
    }

    public boolean getInfoState()
    {
        return infoState;
    }

    public void setInfoState(boolean infoState)
    {
        this.infoState = infoState;
    }

    public List<Long> getFollowers()
    {
        return followers;
    }

    public void setFollowers(List<Long> followers)
    {
        this.followers = followers;
    }

    public void addToFollowers(Long user)
    {
        followers.add(user);
    }

    public void removeFromFollowers(Long user)
    {
        followers.remove(user);
    }

    public List<Long> getFollowings()
    {
        return followings;
    }

    public void setFollowings(List<Long> followings)
    {
        this.followings = followings;
    }

    public void addToFollowings(Long user)
    {
        followings.add(user);
    }

    public void removeFromFollowings(Long user)
    {
        followings.remove(user);
    }

    public List<Long> getBlocked()
    {
        return blocked;
    }

    public void setBlocked(List<Long> blocked)
    {
        this.blocked = blocked;
    }

    public void addToBlocked(Long user)
    {
        blocked.add(user);
    }

    public void removeFromBlocked(Long user)
    {
        blocked.remove(user);
    }

    public List<Long> getMuted()
    {
        return muted;
    }

    public void setMuted(List<Long> muted)
    {
        this.muted = muted;
    }

    public void addToMuted(Long user)
    {
        muted.add(user);
    }

    public void removeFromMuted(Long user)
    {
        muted.remove(user);
    }

    public List<Long> getRequests()
    {
        return requests;
    }

    public void setRequests(List<Long> requests)
    {
        this.requests = requests;
    }

    public void addToRequests(Long user)
    {
        requests.add(user);
    }

    public void removeFromRequests(Long user)
    {
        requests.remove(user);
    }

    public List<Long> getPending()
    {
        return pending;
    }

    public void setPending(List<Long> pending)
    {
        this.pending = pending;
    }

    public void addToPending(Long user)
    {
        pending.add(user);
    }

    public void removeFromPending(Long user)
    {
        pending.remove(user);
    }

    public List<Long> getUserTweets()
    {
        return userTweets;
    }

    public void setUserTweets(List<Long> userTweets)
    {
        this.userTweets = userTweets;
    }

    public void addToUserTweets(Long tweet)
    {
        userTweets.add(tweet);
    }

    public List<Long> getRetweetedTweets()
    {
        return retweetedTweets;
    }

    public void setRetweetedTweets(List<Long> retweetedTweets)
    {
        this.retweetedTweets = retweetedTweets;
    }

    public void addToRetweetedTweets(Long tweet)
    {
        retweetedTweets.add(tweet);
    }

    public void removeFromRetweetedTweets(Long tweet)
    {
        retweetedTweets.remove(tweet);
    }

    public List<Long> getUpvotedTweets()
    {
        return upvotedTweets;
    }

    public void setUpvotedTweets(List<Long> upvotedTweets)
    {
        this.upvotedTweets = upvotedTweets;
    }

    public void addToUpvotedTweets(Long tweet)
    {
        upvotedTweets.add(tweet);
    }

    public void removeFromUpvotedTweets(Long tweet)
    {
        upvotedTweets.remove(tweet);
    }

    public List<Long> getDownvotedTweets()
    {
        return downvotedTweets;
    }

    public void setDownvotedTweets(List<Long> downvotedTweets)
    {
        this.downvotedTweets = downvotedTweets;
    }

    public void addToDownvotedTweets(Long tweet)
    {
        downvotedTweets.add(tweet);
    }

    public void removeFromDownvotedTweets(Long tweet)
    {
        downvotedTweets.remove(tweet);
    }

    public List<Long> getReportedTweets()
    {
        return reportedTweets;
    }

    public void setReportedTweets(List<Long> reportedTweets)
    {
        this.reportedTweets = reportedTweets;
    }

    public void addToReportedTweets(Long tweet)
    {
        reportedTweets.add(tweet);
    }

    public List<Long> getSavedTweets()
    {
        return savedTweets;
    }

    public void setSavedTweets(List<Long> savedTweets)
    {
        this.savedTweets = savedTweets;
    }

    public void addToSavedTweets(Long tweet)
    {
        savedTweets.add(tweet);
    }

    public void removeFromSavedTweets(Long tweet)
    {
        savedTweets.remove(tweet);
    }

    public List<Long> getNotifications()
    {
        return notifications;
    }

    public void setNotifications(List<Long> notifications)
    {
        this.notifications = notifications;
    }

    public void addToNotifications(Long notification)
    {
        notifications.add(notification);
    }

    public List<Long> getGroups()
    {
        return groups;
    }

    public void setGroups(List<Long> groups)
    {
        this.groups = groups;
    }

    public void addToGroups(Long group)
    {
        groups.add(group);
    }

    public void removeGroup(int index)
    {
        groups.remove(index);
    }

    public List<Long> getChats()
    {
        return chats;
    }

    public void setChats(List<Long> chats)
    {
        this.chats = chats;
    }

    public void addToChats(Long chat)
    {
        this.chats.add(chat);
    }
}