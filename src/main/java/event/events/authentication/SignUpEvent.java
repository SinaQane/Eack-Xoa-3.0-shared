package event.events.authentication;

import event.Event;
import event.EventVisitor;
import model.User;
import response.Response;

public class SignUpEvent extends Event
{
    private final User user;
    private final String pic;

    public SignUpEvent(User user, String pic)
    {
        this.user = user;
        this.pic = pic;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.signUp(user, pic);
    }
}
