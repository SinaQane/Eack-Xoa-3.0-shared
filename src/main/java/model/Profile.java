package model;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Profile
{
    private final long id;
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

    Profile(long id)
    {
        this.id = id;
    }

    public long getId()
    {
        return id;
    }

    public String getPicture()
    {
        return base64Picture;
    }

    public Date getLastSeen()
    {
        return lastSeen;
    }

    public boolean isPrivate()
    {
        return privateState;
    }

    public boolean getInfoState()
    {
        return infoState;
    }

    public int getLastSeenState()
    {
        return lastSeenState;
    }

    public List<Long> getFollowers()
    {
        return followers;
    }

    public List<Long> getFollowings()
    {
        return followings;
    }

    public List<Long> getBlocked()
    {
        return blocked;
    }

    public List<Long> getMuted()
    {
        return muted;
    }

    public List<Long> getRequests()
    {
        return requests;
    }

    public List<Long> getPending()
    {
        return pending;
    }

    public List<Long> getNotifications()
    {
        return notifications;
    }

    public List<Long> getChats()
    {
        return chats;
    }

    public List<Long> getGroups()
    {
        return groups;
    }

    public List<Long> getUserTweets()
    {
        return userTweets;
    }

    public List<Long> getRetweetedTweets()
    {
        return retweetedTweets;
    }

    public List<Long> getUpvotedTweets()
    {
        return upvotedTweets;
    }

    public List<Long> getDownvotedTweets()
    {
        return downvotedTweets;
    }

    public List<Long> getReportedTweets()
    {
        return reportedTweets;
    }

    public List<Long> getSavedTweets()
    {
        return savedTweets;
    }

    public void setPicture(String base64Picture)
    {
        this.base64Picture = base64Picture;
    }

    public void setPrivateState(boolean privateState)
    {
        this.privateState = privateState;
    }

    public void setInfoState(boolean infoState)
    {
        this.infoState = infoState;
    }

    public void setLastSeenState(int lastSeenState)
    {
        this.lastSeenState = lastSeenState;
    }

    public void setLastSeen(Date lastSeen)
    {
        this.lastSeen = lastSeen;
    }

    public void setFollowers(List<Long> followers)
    {
        this.followers = followers;
    }

    public void addToFollowers(User user)
    {
        followers.add(user.getId());
    }

    public void removeFromFollowers(User user)
    {
        followers.remove(user.getId());
    }

    public void setFollowings(List<Long> followings)
    {
        this.followings = followings;
    }

    public void addToFollowings(User user)
    {
        followings.add(user.getId());
    }

    public void removeFromFollowings(User user)
    {
        followings.remove(user.getId());
    }

    public void setBlocked(List<Long> blocked)
    {
        this.blocked = blocked;
    }

    public void addToBlocked(User user)
    {
        blocked.add(user.getId());
    }

    public void removeFromBlocked(User user)
    {
        blocked.remove(user.getId());
    }

    public void setMuted(List<Long> muted)
    {
        this.muted = muted;
    }

    public void addToMuted(User user)
    {
        muted.add(user.getId());
    }

    public void removeFromMuted(User user)
    {
        muted.remove(user.getId());
    }

    public void setRequests(List<Long> requests)
    {
        this.requests = requests;
    }

    public void addToRequests(User user)
    {
        requests.add(user.getId());
    }

    public void removeFromRequests(User user)
    {
        requests.remove(user.getId());
    }

    public void setPending(List<Long> pending)
    {
        this.pending = pending;
    }

    public void addToPending(User user)
    {
        pending.add(user.getId());
    }

    public void removeFromPending(User user)
    {
        pending.remove(user.getId());
    }

    public void setUserTweets(List<Long> userTweets)
    {
        this.userTweets = userTweets;
    }

    public void addToUserTweets(Tweet tweet)
    {
        userTweets.add(tweet.getId());
    }

    public void setRetweetedTweets(List<Long> retweetedTweets)
    {
        this.retweetedTweets = retweetedTweets;
    }

    public void addToRetweetedTweets(Tweet tweet)
    {
        retweetedTweets.add(tweet.getId());
    }

    public void removeFromRetweetedTweets(Tweet tweet)
    {
        retweetedTweets.remove(tweet.getId());
    }

    public void setUpvotedTweets(List<Long> upvotedTweets)
    {
        this.upvotedTweets = upvotedTweets;
    }

    public void addToUpvotedTweets(Tweet tweet)
    {
        upvotedTweets.add(tweet.getId());
    }

    public void removeFromUpvotedTweets(Tweet tweet)
    {
        upvotedTweets.remove(tweet.getId());
    }

    public void setDownvotedTweets(List<Long> downvotedTweets)
    {
        this.downvotedTweets = downvotedTweets;
    }

    public void addToDownvotedTweets(Tweet tweet)
    {
        downvotedTweets.add(tweet.getId());
    }

    public void removeFromDownvotedTweets(Tweet tweet)
    {
        downvotedTweets.remove(tweet.getId());
    }

    public void setReportedTweets(List<Long> reportedTweets)
    {
        this.reportedTweets = reportedTweets;
    }

    public void addToReportedTweets(Tweet tweet)
    {
        reportedTweets.add(tweet.getId());
    }

    public void addToSavedTweets(Tweet tweet)
    {
        savedTweets.add(tweet.getId());
    }

    public void setSavedTweets(List<Long> savedTweets)
    {
        this.savedTweets = savedTweets;
    }

    public void removeFromSavedTweets(Tweet tweet)
    {
        savedTweets.remove(tweet.getId());
    }

    public void setNotifications(List<Long> notifications)
    {
        this.notifications = notifications;
    }

    public void addToNotifications(Notification notification)
    {
        notifications.add(notification.getId());
    }

    public void setGroups(List<Long> groups)
    {
        this.groups = groups;
    }

    public void addToGroups(Group group)
    {
        groups.add(group.getId());
    }

    public void setChats(List<Long> chats)
    {
        this.chats = chats;
    }

    public void addToChats(Chat chat)
    {
        this.chats.add(chat.getId());
    }

    /* TODO without db

    public Group getGroup(String groupName)
    {
        for (Group group : groups)
        {
            if (group.getTitle().equals(groupName))
            {
                return group;
            }
        }

        return null;
    }

    public void addToGroups(Group group)
    {
        int index = -1;
        for (int i = 0; i < groups.size(); i++)
        {
            if (groups.get(i).getTitle().equals(group.getTitle()))
            {
                index = i;
            }
        }
        if(index != -1)
        {
            groups.remove(index);
        }
        groups.add(group);
    }

    A HashMap that links every tweet to 2 variables:
    1. A bit that shows that is this tweet a retweet ("1") or the user's tweet ("0").
    2. A long that shows the time that this tweet was tweeted, in milliseconds.

    public List<String[]> getHomePageTweets()
    {
        HashMap<String[], Long> homePageTweets = new HashMap<>();

        for (String userTweet : userTweets)
        {
            Tweet tweet = TweetDB.getTweetDB().get(userTweet);
            homePageTweets.put(new String[]{userTweet, "0"}, tweet.getTweetDate().getTime());
        }

        for (String retweetedTweet : retweetedTweets)
        {
            Tweet tweet = TweetDB.getTweetDB().get(retweetedTweet);
            homePageTweets.put(new String[]{retweetedTweet, "1"}, tweet.getTweetDate().getTime());
        }

        List<String[]> result = new LinkedList<>();

        for (Map.Entry<String[], Long> e : HashMapUtil.sortByValue(homePageTweets).entrySet())
        {
            result.add(0, e.getKey());
        }

        return result;
    }*/
}