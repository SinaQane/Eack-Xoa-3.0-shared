package response;

import exceptions.DatabaseError;
import exceptions.authentication.LoginFailed;
import exceptions.authentication.SignUpFailed;
import model.*;

public interface ResponseVisitor
{
    // Authentication event responses

    void login(User user, LoginFailed err);

    void signUp(User user, SignUpFailed err);

    // Database event responses

    void getChat(Chat chat, DatabaseError err);

    void getGroup(Group group, DatabaseError err);

    void getMessage(Message message, DatabaseError err);

    void getNotification(Notification notification, DatabaseError err);

    void getTweet(Tweet tweet, DatabaseError err);

    void getUser(User user, Profile profile, DatabaseError err);
}