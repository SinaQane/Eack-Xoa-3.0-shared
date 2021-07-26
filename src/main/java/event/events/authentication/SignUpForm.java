package event.events.authentication;

import java.util.Date;
import java.util.EventObject;
import java.util.Locale;

public class SignUpForm extends EventObject
{
    private final String phoneNumber;
    private final String username;
    private final String password;
    private final Date birthDate;
    private final String picture;
    private final String email;
    private final String name;
    private final String bio;

    public SignUpForm(Object source)
    {
        super(source);
        username = password = name = email = phoneNumber = bio = picture = "";
        birthDate = null;
    }

    public SignUpForm(Object source, String username, String password, String name,
                           String email, String phoneNumber, String bio, Date birthDate, String picture)
    {
        super(source);
        this.username = username.toLowerCase(Locale.ROOT);
        this.email = email.toLowerCase(Locale.ROOT);
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.password = password;
        this.picture = picture;
        this.name = name;
        this.bio = bio;
    }

    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public Date getBirthDate()
    {
        return birthDate;
    }

    public String getPicture()
    {
        return picture;
    }

    public String getBio()
    {
        return bio;
    }
}