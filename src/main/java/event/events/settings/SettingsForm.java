package event.events.settings;

import java.util.Date;
import java.util.EventObject;
import java.util.Locale;

public class SettingsForm extends EventObject
{
    private String username;
    private String password;
    private String name;
    private String email;
    private String phoneNumber;
    private String bio;
    private String picture;
    private Date birthDate;
    private boolean privateState;
    private boolean infoState;
    private int lastSeenState;

    private final boolean[] isChanging;

    public SettingsForm(Object source)
    {
        super(source);
        isChanging = new boolean[]{false, false, false, false, false, false,false, false, false, false, false};
    }

    public String getUsername()
    {
        return username;
    }

    public boolean isUsernameChanging()
    {
        return isChanging[0];
    }

    public void setUsername(String username)
    {
        this.username = username.toLowerCase(Locale.ROOT);
        isChanging[0] = true;
    }

    public String getPassword()
    {
        return password;
    }

    public boolean isPasswordChanging()
    {
        return isChanging[1];
    }

    public void setPassword(String password)
    {
        this.password = password;
        isChanging[1] = true;
    }

    public String getName()
    {
        return name;
    }

    public boolean isNameChanging()
    {
        return isChanging[2];
    }

    public void setName(String name)
    {
        this.name = name;
        isChanging[2] = true;
    }

    public String getEmail()
    {
        return email;
    }

    public boolean isEmailChanging()
    {
        return isChanging[3];
    }

    public void setEmail(String email)
    {
        this.email = email.toLowerCase(Locale.ROOT);
        isChanging[3] = true;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public boolean isPhoneNumberChanging()
    {
        return isChanging[4];
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        isChanging[4] = true;
    }

    public String getBio()
    {
        return bio;
    }

    public boolean isBioChanging()
    {
        return isChanging[5];
    }

    public void setBio(String bio)
    {
        this.bio = bio;
        isChanging[5] = true;
    }

    public Date getBirthDate()
    {
        return birthDate;
    }

    public boolean isBirthDateChanging()
    {
        return isChanging[6];
    }

    public void setBirthDate(Date birthDate)
    {
        this.birthDate = birthDate;
        isChanging[6] = true;
    }

    public boolean isPrivateState()
    {
        return privateState;
    }

    public boolean isPrivateStateChanging()
    {
        return isChanging[7];
    }

    public void setPrivateState(boolean privateState)
    {
        this.privateState = privateState;
        isChanging[7] = true;
    }

    public boolean isInfoState()
    {
        return infoState;
    }

    public boolean isInfoStateChanging()
    {
        return isChanging[8];
    }

    public void setInfoState(boolean infoState)
    {
        this.infoState = infoState;
        isChanging[8] = true;
    }

    public int getLastSeenState()
    {
        return lastSeenState;
    }

    public boolean isLastSeenStateChanging()
    {
        return isChanging[9];
    }

    public void setLastSeenState(int lastSeenState)
    {
        this.lastSeenState = lastSeenState;
        isChanging[9] = true;
    }

    public String getPicture()
    {
        return picture;
    }

    public boolean isPictureChanging()
    {
        return isChanging[10];
    }

    public void setPicture(String picture)
    {
        this.picture = picture;
        isChanging[10] = true;
    }
}
