package event.events.settings;

import event.Event;
import event.EventVisitor;
import response.Response;

public class SettingsEvent extends Event
{
    private final SettingsForm form;
    private final boolean online;
    private final long userId;
    private String authToken;

    public SettingsEvent(SettingsForm form, Long userId, String authToken)
    {
        this.form = form;
        this.online = true;
        this.userId = userId;
        this.authToken = authToken;
    }

    public SettingsEvent(SettingsForm form, Long userId)
    {
        this.form = form;
        this.online = false;
        this.userId = userId;
    }

    public void setAuthToken(String authToken)
    {
        this.authToken = authToken;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.settings(form, userId, authToken, online);
    }
}