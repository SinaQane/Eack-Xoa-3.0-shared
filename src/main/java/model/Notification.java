package model;

public class Notification
{
    private Long id = -1L;
    private Long owner = -1L;
    private Long requestFrom = -1L;
    private String text = "";

    public Notification() {}

    // Constructor for the case this is a request notification
    public Notification(Long owner, Long request, String text)
    {
        this.owner = owner;
        this.requestFrom = request;
        this.text = text;
    }

    // Constructor for the default case
    public Notification(Long owner, String text)
    {
        this.owner = owner;
        this.requestFrom = -1L;
        this.text = text;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getOwner()
    {
        return owner;
    }

    public void setOwner(Long owner)
    {
        this.owner = owner;
    }

    public Long getRequestFrom()
    {
        return requestFrom;
    }

    public void setRequestFrom(Long requestFrom)
    {
        this.requestFrom = requestFrom;
    }

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }
}
