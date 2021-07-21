package model;

import java.util.LinkedList;
import java.util.List;

public class Group
{
    private final long id;
    private String title;
    private List<Long> members = new LinkedList<>();

    public Group(long id, String title)
    {
        this.id = id;
        this.title = title;
    }

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

    public void editTitle(String newTitle)
    {
        title = newTitle;
    }

    public void setMembers(List<Long> members)
    {
        this.members = members;
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
