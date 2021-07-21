package model;

public class Notification
{
    private final long id;
    private final long owner;
    private final long requestFrom;
    private final String text;

    // Constructor for the case this is a request notification
    public Notification(long id, long owner, long request, String text)
    {
        this.id = id;
        this.owner = owner;
        this.requestFrom = request;
        this.text = text;
    }

    // Constructor for the default case
    public Notification(long id, long owner, String text)
    {
        this.id = id;
        this.owner = owner;
        this.requestFrom = -1;
        this.text = text;
    }

    public long getId()
    {
        return id;
    }

    public long getOwner()
    {
        return owner;
    }

    public long getRequestFrom()
    {
        return requestFrom;
    }

    public String getText()
    {
        return text;
    }
}
