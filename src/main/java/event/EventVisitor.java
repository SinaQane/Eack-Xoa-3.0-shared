package event;

import event.events.authentication.LoginForm;
import event.events.authentication.SignUpForm;
import event.events.settings.SettingsForm;
import response.Response;

public interface EventVisitor
{
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

    // General events

    Response sendTweet(long userId, long upperTweet, String tweet, String picture, String authToken);

    Response viewList(String list, long userId);

    Response viewTweet(long tweetId);

    Response viewUser(long userId);

    // Settings page events

    Response settings(SettingsForm form, Long userId, String authToken, boolean online);

    Response deleteAccount(long userId, String authToken, boolean online);

    Response deactivate(long userId, String authToken, boolean online);

    // Profile page events

    Response viewProfile(long userId);

    Response refreshProfile(long userId);

    Response userInteraction(String interaction, long userId, long otherUserId, String authToken);

    // Tweet events

    Response tweetInteraction(String interaction, long userId, long tweetId, String authToken);
}
