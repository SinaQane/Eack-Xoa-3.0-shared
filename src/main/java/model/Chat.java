package model;

import java.util.LinkedList;
import java.util.List;

public class Chat
{
    private final long id;
    private String chatName;
    private final boolean group;
    private List<Long> users = new LinkedList<>();
    private List<Long> messages = new LinkedList<>();

    // Constructor for easy use in ChatsListPaneFXML class
    public Chat()
    {
        this.id = -1;
        this.group = false;
    }

    // Constructor for group chats
    public Chat(long id, User user, String chatName)
    {
        this.id = id;
        this.group = true;
        this.chatName = chatName;
        this.users.add(user.getId());
    }

    // Constructor for private chats
    public Chat(long id, User user1, User user2)
    {
        this.id = id;
        this.group = false;
        this.chatName = user1.getUsername() + " - " + user2.getUsername();
        this.users.add(user1.getId());
        this.users.add(user2.getId());
    }

    public long getId()
    {
        return this.id;
    }

    public boolean isGroup()
    {
        return group;
    }

    public String getChatName()
    {
        return chatName;
    }

    public List<Long> getUsers()
    {
        return this.users;
    }

    public List<Long> getMessages()
    {
        return messages;
    }

    public void setChatName(String chatsName)
    {
        this.chatName = chatsName;
    }

    public void setUsers(List<Long> users)
    {
        this.users = users;
    }

    public void addToUsers(User user)
    {
        if (!this.users.contains(user.getId()))
        {
            this.users.add(user.getId());
        }
    }

    public void setMessages(List<Long> messages)
    {
        this.messages = messages;
    }

    public void addToMessages(Message message)
    {
        messages.add(message.getId());
    }

    /* TODO without db

    public long getLastMessageTime()
    {
        if (this.messages.size() != 0)
        {
            return this.messages.get(this.messages.size() - 1).getMessageDate();
        }
        return 0;
    }

    public int getUnseenCount(User user)
    {
        int cnt = 0;
        for (Message message : this.messages)
        {
            if (!message.getSeenList().contains(user.getId()))
            {
                cnt++;
            }
        }
        return cnt;
    }*/
}
