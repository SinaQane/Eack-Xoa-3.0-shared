package model;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Message
{
    // id is the id of the message in the database (unique)
    private final long id;

    // chatId is the id of the chatroom which this message belongs to
    private final long chatId;

    // ownerId is the id of the owner of the message
    private final long ownerId;

    // tweetId is the id of the tweet which this message forwards that (-1 if non-existent)
    private final long tweetId;

    // index is the index of message in the sorted messages of the chatroom
    private final int index;

    // Message info

    private String text;
    private final String base64Picture;
    private final long messageDateUnix = new Date().getTime();
    private final List<Long> seenList = new LinkedList<>();

    // Constructor for the case which the message is a dm

    public Message(long id, Chat chat, User user, String text, String base64Picture)
    {
        this.id = id;
        chatId = chat.getId();
        ownerId = user.getId();
        tweetId = -1;
        index = chat.getMessages().size();
        this.text = text;
        this.base64Picture = base64Picture;
        // TODO chat.addToMessages(this);
    }

    // Constructor for the case which the message is a forwarded tweet

    public Message(long id, Chat chat, User user, Tweet tweet)
    {
        this.id = id;
        chatId = chat.getId();
        ownerId = user.getId();
        index = chat.getMessages().size();
        text = tweet.getText();
        base64Picture = tweet.getPicture();
        tweetId = tweet.getId();
        // TODO chat.addToMessages(this);
    }

    // Getters

    public long getId()
    {
        return id;
    }

    public long getChatId()
    {
        return chatId;
    }

    public long getOwnerId()
    {
        return ownerId;
    }

    public long getTweetId()
    {
        return tweetId;
    }

    public int getIndex()
    {
        return index;
    }

    public String getText()
    {
        return text;
    }

    public String getPicture()
    {
        return base64Picture;
    }

    public long getMessageDate()
    {
        return messageDateUnix;
    }

    public List<Long> getSeenList()
    {
        return seenList;
    }

    // Setters

    public void addToSeen(User user)
    {
        if (!seenList.contains(user.getId()))
        {
            seenList.add(user.getId());
        }
    }

    public void edit(String text)
    {
        this.text = "(edited) " + text;
    }

    public void delete()
    {
        text = "*this message was deleted*";
    }
}
