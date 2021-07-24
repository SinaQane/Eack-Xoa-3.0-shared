package event.events.authentication;

import event.Event;
import event.EventVisitor;
import model.User;
import response.Response;

public class LoginEvent extends Event
{
    private final User user;

    public LoginEvent(User user)
    {
        this.user = user;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.login(user);
    }
}
