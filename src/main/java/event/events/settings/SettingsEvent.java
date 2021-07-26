package event.events.settings;

import event.Event;
import event.EventVisitor;
import response.Response;

public class SettingsEvent extends Event
{
    private final SettingsForm form;
    private final boolean online;

    public SettingsEvent(SettingsForm form, boolean online)
    {
        this.form = form;
        this.online = online;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.settings(form, online);
    }
}