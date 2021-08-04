package event.events.groups;

import java.util.List;

public class ManageGroupForm
{
    private final Long id;
    private final String title;
    private final List<String> toAdd;
    private final List<String> toRemove;

    public ManageGroupForm(Long id, String title, List<String> toAdd, List<String> toRemove)
    {
        this.id = id;
        this.title = title;
        this.toAdd = toAdd;
        this.toRemove = toRemove;
    }

    public Long getId()
    {
        return id;
    }

    public String getTitle()
    {
        return title;
    }

    public List<String> getToAdd()
    {
        return toAdd;
    }

    public List<String> getToRemove()
    {
        return toRemove;
    }
}
