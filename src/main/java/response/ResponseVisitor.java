package response;

import model.*;

public interface ResponseVisitor
{
    // Authentication event responses

    void login(User user, Exception err);

    void signUp(User user, Exception err);

    // Database event responses

    void getChat(Chat chat, Exception err);

    void getGroup(Group group, Exception err);

    void getMessage(Message message, Exception err);

    void getNotification(Notification notification, Exception err);

    void getTweet(Tweet tweet, Exception err);

    void getUser(User user, Profile profile, Exception err);
}