package event.events.groups;

import java.util.List;

public class ManageGroupForm
{
    private final Long id;
    private final String title;
    private final List<String> toAdd;
    private final List<String> roRemove;

    public ManageGroupForm(Long id, String title, List<String> toAdd, List<String> roRemove)
    {
        this.id = id;
        this.title = title;
        this.toAdd = toAdd;
        this.roRemove = roRemove;
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

    public List<String> getRoRemove()
    {
        return roRemove;
    }
}
