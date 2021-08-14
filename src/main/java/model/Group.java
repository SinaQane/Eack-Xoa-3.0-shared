package model;

import java.util.LinkedList;
import java.util.List;

public class Group
{
    private Long id = -1L;
    private String title = "";
    private List<Long> members = new LinkedList<>();

    public Group() {}

    public Group(String title)
    {
        this.title = title;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void editTitle(String newTitle)
    {
        title = newTitle;
    }

    public List<Long> getMembers()
    {
        return members;
    }

    public void setMembers(List<Long> members)
    {
        this.members = members;
    }

    public void addToGroup(Long user)
    {
        if (!members.contains(user))
        {
            members.add(user);
        }
    }

    public void removeFromGroup(Long user)
    {
        members.remove(user);
    }
}
