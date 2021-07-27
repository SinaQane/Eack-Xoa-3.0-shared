package response;

import exceptions.DatabaseError;
import exceptions.Unauthenticated;
import exceptions.authentication.LoginFailed;
import exceptions.authentication.SignUpFailed;
import exceptions.settings.SettingsFailed;
import model.*;

public interface ResponseVisitor
{
    // Database event responses

    void getChat(Chat chat, DatabaseError err);

    void getGroup(Group group, DatabaseError err);

    void getMessage(Message message, DatabaseError err);

    void getNotification(Notification notification, DatabaseError err);

    void getTweet(Tweet tweet, DatabaseError err);

    void getUser(User user, Profile profile, DatabaseError err);

    // Authentication event responses

    void login(User user, String authToken, LoginFailed err);

    void offlineLogin(User user, String authToken);

    void signUp(User user, String authToken, SignUpFailed err);

    // General event responses

    void sendTweet(Unauthenticated err);

    // Settings page event responses

    void settings(boolean online, SettingsFailed err, Unauthenticated authErr);

    void deleteAccount(boolean online, Unauthenticated err);

    void deactivate(boolean online, Unauthenticated err);

    // Profile page event responses

    void userInteraction(Unauthenticated err);

    // Tweet event responses

    void tweetInteraction(Unauthenticated err);
}