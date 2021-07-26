package event;

import event.events.authentication.LoginForm;
import event.events.authentication.SignUpForm;
import model.User;
import response.Response;

public interface EventVisitor
{
    // Authentication events

    Response login(LoginForm form);

    Response signUp(SignUpForm form);

    // Database events

    Response getChat(long id);

    Response getGroup(long id);

    Response getMessage(long id);

    Response getNotification(long id);

    Response getTweet(long id);

    Response getUser(long id);
}
