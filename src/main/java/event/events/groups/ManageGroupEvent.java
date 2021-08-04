package event.events.groups;

import event.Event;
import event.EventVisitor;
import response.Response;

public class ManageGroupEvent extends Event
{
    private final ManageGroupForm form;
    private final String authToken;

    public ManageGroupEvent(ManageGroupForm form, String authToken)
    {
        this.form = form;
        this.authToken = authToken;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.manageGroup(form, authToken);
    }
}
