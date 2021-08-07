package event.events.messages;

public class MessageForm
{
    private Long id;
    private Long chatId;
    private Long ownerId;

    private String text;
    private String base64Picture;
    private Long messageDateUnix;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getChatId()
    {
        return chatId;
    }

    public void setChatId(Long chatId)
    {
        this.chatId = chatId;
    }

    public Long getOwnerId()
    {
        return ownerId;
    }

    public void setOwnerId(Long ownerId)
    {
        this.ownerId = ownerId;
    }

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    public String getBase64Picture()
    {
        return base64Picture;
    }

    public void setBase64Picture(String base64Picture)
    {
        this.base64Picture = base64Picture;
    }

    public Long getMessageDateUnix()
    {
        return messageDateUnix;
    }

    public void setMessageDateUnix(Long messageDateUnix)
    {
        this.messageDateUnix = messageDateUnix;
    }
}
