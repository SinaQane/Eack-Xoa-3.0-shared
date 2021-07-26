package event.events.authentication;

import java.util.EventObject;
import java.util.Locale;

public class LoginForm extends EventObject
{
    private final String username;
    private final String password;

    public LoginForm(Object source)
    {
        super(source);
        username = password = "";
    }

    public LoginForm(Object source, String user, String pass)
    {
        super(source);
        username = user.toLowerCase(Locale.ROOT);
        password = pass;
    }

    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }
}