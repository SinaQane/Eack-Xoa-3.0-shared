package model;

import java.util.LinkedList;
import java.util.List;

public class Group
{
    // id is the id of the group in the database (unique)
    private final long id;

    // Group's title is a unique string, but not constant
    private String title;

    private final List<Long> members = new LinkedList<>();

    // Constructor

    public Group(long id, String title)
    {
        this.id = id;
        this.title = title;
    }

    // Getters

    public long getId()
    {
        return id;
    }

    public String getTitle()
    {
        return title;
    }

    public List<Long> getMembers()
    {
        return members;
    }

    // Setters

    public void editTitle(String newTitle)
    {
        title = newTitle;
    }

    public void addToGroup(User user)
    {
        if (!members.contains(user.getId()))
        {
            members.add(user.getId());
        }
    }

    public void removeFromGroup(User user)
    {
        members.remove(user.getId());
    }
}
