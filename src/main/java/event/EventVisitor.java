package event;

import model.User;
import response.Response;

public interface EventVisitor
{
    // Authentication events

    Response login(User user);

    Response signUp(User user, String pic);

    // Database events

    Response getChat(long id);

    Response getGroup(long id);

    Response getMessage(long id);

    Response getNotification(long id);

    Response getTweet(long id);

    Response getUser(long id);
}
