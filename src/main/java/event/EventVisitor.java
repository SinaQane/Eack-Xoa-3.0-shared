package event;

import event.events.authentication.LoginForm;
import event.events.authentication.SignUpForm;
import event.events.general.SendTweetForm;
import event.events.groups.ManageGroupForm;
import event.events.messages.MessageForm;
import event.events.settings.SettingsForm;
import model.Message;
import response.Response;

import java.util.List;

public interface EventVisitor
{
    // Ping request event

    Response ping(String ping);

    // Database events

    Response getChat(long id);

    Response getGroup(long id);

    Response getMessage(long id);

    Response getNotification(long id);

    Response getTweet(long id);

    Response getUser(long id);

    // Authentication events

    Response login(LoginForm form);

    Response offlineLogin(long userId);

    Response signUp(SignUpForm form);

    Response logout(long userId, String authToken);

    // General events

    Response sendTweet(SendTweetForm form);

    Response viewList(String list, long userId);

    Response refreshList(String list, long userId);

    Response viewTweet(long tweetId);

    Response refreshTweet(long tweetId);

    Response viewUser(long userId);

    Response refreshUser(long userId);

    Response requestReaction(String reaction, long notificationId, String authToken);

    // Settings page events

    Response settings(SettingsForm form, Long userId, String authToken, boolean online);

    Response deleteAccount(long userId, String authToken, boolean online);

    Response deactivate(long userId, String authToken, boolean online);

    // Profile page events

    Response viewProfile(long userId);

    Response refreshProfile(long userId);

    Response userInteraction(String interaction, long userId, long otherUserId, String authToken);

    // Explore page events

    Response explore(long userId);

    Response searchUser(long userId, String searchedWord);

    // Timeline/Bookmark page events

    Response viewTimeline(long userId);

    Response refreshTimeline(long userId);

    Response viewBookmarks(long userId);

    Response refreshBookmarks(long userId);

    // Groups page events

    Response viewGroupsPage(Long userId);

    Response refreshGroupsPage(Long userId);

    Response manageGroup(ManageGroupForm form, String authToken);

    // Messages page events

    Response receivedAllMessages(Long userId, String authToken);

    Response viewChatroom(Long chatId);

    Response refreshChatroom(Long chatId);

    Response viewMessagesPage(Long userId);

    Response refreshMessagesPage(Long userId);

    Response sendMessage(MessageForm form, String authToken);

    Response editMessage(MessageForm form, String authToken);

    Response deleteMessage(long messageId, String authToken);

    Response sendCachedMessages(List<Message> messages, String authToken);

    // Tweet events

    Response tweetInteraction(String interaction, long userId, long tweetId, String authToken);

    Response forwardTweet(String usernames, String groups, long tweetId, String authToken);
}
