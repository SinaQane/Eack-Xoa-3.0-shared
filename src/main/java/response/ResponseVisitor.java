package response;

import model.*;

public interface ResponseVisitor
{
    // Database event responses

    void getChat(Chat chat);

    void getGroup(Group group);

    void getMessage(Message message);

    void getNotification(Notification notification);

    void getTweet(Tweet tweet);

    void getUser(User user, Profile profile);
}