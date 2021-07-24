package model;

import java.util.LinkedList;
import java.util.List;

public class Chat
{
    private Long id;
    private String chatName;
    private boolean group;
    private List<Long> users = new LinkedList<>();
    private List<Long> messages = new LinkedList<>();

    public Chat()
    {
        this.id = -1L;
        this.group = false;
    }

    // Constructor for group chats
    public Chat(User user, String chatName)
    {
        this.group = true;
        this.chatName = chatName;
        this.users.add(user.getId());
    }

    // Constructor for private chats
    public Chat(User user1, User user2)
    {
        this.group = false;
        this.chatName = user1.getUsername() + " - " + user2.getUsername();
        this.users.add(user1.getId());
        this.users.add(user2.getId());
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isGroup()
    {
        return group;
    }

    public void setGroup(boolean group)
    {
        this.group = group;
    }

    public String getChatName()
    {
        return chatName;
    }

    public void setChatName(String chatsName)
    {
        this.chatName = chatsName;
    }

    public List<Long> getUsers()
    {
        return this.users;
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

    public List<Long> getMessages()
    {
        return messages;
    }

    public void setMessages(List<Long> messages)
    {
        this.messages = messages;
    }

    public void addToMessages(Message message)
    {
        messages.add(message.getId());
    }
}
