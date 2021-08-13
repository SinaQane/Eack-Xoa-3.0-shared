package response;

import exceptions.DatabaseError;
import exceptions.Unauthenticated;
import exceptions.authentication.LoginFailed;
import exceptions.authentication.LogoutFailed;
import exceptions.authentication.SignUpFailed;
import exceptions.messages.ChatCreationFailed;
import exceptions.settings.SettingsFailed;
import exceptions.tweet.ForwardFailed;
import model.*;

import java.util.List;

public interface ResponseVisitor
{
    //  Ping request event response

    void pong(String pong);

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

    void logout(LogoutFailed logoutErr, Unauthenticated authErr);

    // General event responses

    void sendTweet(Unauthenticated err);

    void viewList(String pageKind, User user, List<List<Long>> items);

    void refreshList(String pageKind, User user, List<List<Long>> items);

    void viewTweet(Tweet tweet, List<List<Long>> comments);

    void refreshTweet(Tweet tweet, List<List<Long>> comments);

    void viewUser(User user, List<List<Long[]>> tweets);

    void refreshUser(User user, List<List<Long[]>> tweets);

    void requestReaction(Unauthenticated authErr);

    void refreshLastSeen();

    // Settings page event responses

    void settings(boolean online, SettingsFailed err, Unauthenticated authErr);

    void deleteAccount(boolean online, Unauthenticated err);

    void deactivate(boolean online, Unauthenticated err);

    // Profile page event responses

    void viewProfile(User user, List<List<Long[]>> tweets);

    void refreshProfile(User user, List<List<Long[]>> tweets);

    void userInteraction(Unauthenticated err);

    // Explore page event responses

    void explore(List<Long> tweets);

    void searchUser(List<List<Long>> users);

    // Timeline/Bookmark page event responses

    void viewTimeline(List<List<Long[]>> tweets);

    void refreshTimeline(List<List<Long[]>> tweets);

    void viewBookmarks(List<List<Long[]>> tweets);

    void refreshBookmarks(List<List<Long[]>> tweets);

    // Groups page event responses

    void viewGroupsPage(List<List<Long>> groups);

    void refreshGroupsPage(List<List<Long>> groups);

    void manageGroup(Unauthenticated err);

    // Messages page event responses

    void receivedAllMessages(Unauthenticated err);

    void viewChatroom(List<Long> messages, Long chatId);

    void refreshChatroom(List<Long> messages, Long chatId);

    void viewMessagesPage(List<List<Long[]>> chatsList);

    void refreshMessagesPage(List<List<Long[]>> chatsList);

    void sendMessage(Unauthenticated err);

    void editMessage(Unauthenticated err);

    void deleteMessage(Unauthenticated err);

    void sendCachedMessages(Unauthenticated err);

    void newChat(Unauthenticated err, ChatCreationFailed failed);

    void addMember(Unauthenticated err);

    void leaveGroup(Unauthenticated err);

    // Tweet event responses

    void tweetInteraction(Unauthenticated err);

    void forwardTweet(ForwardFailed forwardErr, Unauthenticated authErr);
}