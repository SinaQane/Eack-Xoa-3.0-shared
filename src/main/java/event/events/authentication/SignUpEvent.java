package event.events.authentication;

import event.Event;
import event.EventVisitor;
import response.Response;

public class SignUpEvent extends Event
{
    private final SignUpForm form;

    public SignUpEvent(SignUpForm form)
    {
        this.form = form;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.signUp(form);
    }
}
