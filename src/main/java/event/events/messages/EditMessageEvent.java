package event.events.messages;

import event.Event;
import event.EventVisitor;
import response.Response;

public class EditMessageEvent extends Event
{
    private final MessageForm form;
    private final String authToken;

    public EditMessageEvent(MessageForm form, String authToken)
    {
        this.form = form;
        this.authToken = authToken;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.editMessage(form, authToken);
    }
}
