package model;

import java.util.LinkedList;
import java.util.List;

public class Chat
{
    private Long id = -1L;
    private String chatName = "";
    private boolean group = false;
    private List<Long> users = new LinkedList<>();
    private List<Long> messages = new LinkedList<>();

    public Chat()
    {
        id = -1L;
    }

    // Constructor for group chats
    public Chat(User user, String name)
    {
        group = true;
        chatName = name;
        users.add(user.getId());
    }

    // Constructor for private chats
    public Chat(User user1, User user2)
    {
        chatName = user1.getUsername() + " - " + user2.getUsername();
        users.add(user1.getId());
        users.add(user2.getId());
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
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

    public void addToUsers(Long user)
    {
        if (!users.contains(user))
        {
            users.add(user);
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

    public void addToMessages(Long message)
    {
        messages.add(message);
    }
}
