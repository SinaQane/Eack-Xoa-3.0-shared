package event;

import event.events.authentication.LoginForm;
import event.events.authentication.SignUpForm;
import event.events.settings.SettingsForm;
import response.Response;

public interface EventVisitor
{
    // Authentication events

    Response login(LoginForm form);

    Response offlineLogin(long userId);

    Response signUp(SignUpForm form);

    // Settings page events

    Response settings(SettingsForm form, Long userId, String authToken, boolean online);

    Response deleteAccount(long userId, String authToken, boolean online);

    Response deactivate(long userId, String authToken, boolean online);

    // Database events

    Response getChat(long id);

    Response getGroup(long id);

    Response getMessage(long id);

    Response getNotification(long id);

    Response getTweet(long id);

    Response getUser(long id);
}
