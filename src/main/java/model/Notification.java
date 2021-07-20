package model;

public class Notification
{
    // id is the id of the notification in the database (unique)
    private final long id;

    // owner is the id of the notification's owner in the database
    private final long owner;

    // requestFrom is the id of the user which is notification is a request from them
    private final long requestFrom;

    // text is the text of the notification shown to the user
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

    // Getters

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
