package model;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Message
{
    private Long id;
    private String text;
    private Long chatId;
    private Long ownerId;
    private int index;
    private String base64Picture;
    private Long messageDateUnix;
    private List<Long> seenList = new LinkedList<>();

    // For private chats (phase-3 shit)
    private boolean sent;
    private boolean received;
    private boolean seen;

    // tweetId is the id of the tweet which this message forwards that (-1 if non-existent)
    private Long tweetId;

    public Message() {}

    // Constructor for the case which the message is a dm
    public Message(Chat chat, User user, String text, String base64Picture)
    {
        tweetId = -1L;
        this.text = text;
        chatId = chat.getId();
        ownerId = user.getId();
        index = chat.getMessages().size();
        this.base64Picture = base64Picture;
        messageDateUnix = new Date().getTime();
        // TODO chat.addToMessages(this);
    }

    // Constructor for the case which the message is a forwarded tweet
    public Message(Chat chat, User user, Tweet tweet)
    {
        text = tweet.getText();
        ownerId = user.getId();
        tweetId = tweet.getId();
        chatId = chat.getId();
        index = chat.getMessages().size();
        base64Picture = tweet.getPicture();
        messageDateUnix = new Date().getTime();
        // TODO chat.addToMessages(this);
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getChatId()
    {
        return chatId;
    }

    public void setChatId(Long chatId)
    {
        this.chatId = chatId;
    }

    public Long getOwnerId()
    {
        return ownerId;
    }

    public void setOwnerId(Long ownerId)
    {
        this.ownerId = ownerId;
    }

    public long getTweetId()
    {
        return tweetId;
    }

    public void setTweetId(Long tweetId)
    {
        this.tweetId = tweetId;
    }

    public int getIndex()
    {
        return index;
    }

    public void setIndex(int index)
    {
        this.index = index;
    }

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    public void edit(String text)
    {
        this.text = "(edited) " + text;
    }

    public void delete()
    {
        text = "*this message was deleted*";
    }

    public String getPicture()
    {
        return base64Picture;
    }

    public void setPicture(String base64Picture)
    {
        this.base64Picture = base64Picture;
    }

    public long getMessageDate()
    {
        return messageDateUnix;
    }

    public void setMessageDate(Long messageDateUnix)
    {
        this.messageDateUnix = messageDateUnix;
    }

    public List<Long> getSeenList()
    {
        return seenList;
    }

    public void setSeenList(List<Long> seenList)
    {
        this.seenList = seenList;
    }

    public void addToSeen(User user)
    {
        if (!seenList.contains(user.getId()))
        {
            seenList.add(user.getId());
        }
    }

    // New private chat shit

    public boolean isSent()
    {
        return sent;
    }

    public void setSent(boolean sent)
    {
        this.sent = sent;
    }

    public boolean isReceived()
    {
        return received;
    }

    public void setReceived(boolean received)
    {
        this.received = received;
    }

    public boolean isSeen()
    {
        return seen;
    }

    public void setSeen(boolean seen)
    {
        this.seen = seen;
    }
}
