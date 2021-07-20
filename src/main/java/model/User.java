package model;

import java.util.Date;

public class User
{
    // User's info

    // id is the id of the user in the database (unique)
    private final Long id;

    private String username;
    private String password;
    private String name;
    private String email;
    private String phoneNumber;
    private String bio;
    private Date birthDate;

    // Page info

    // isActive is "true" if the page is active and "false" if it's deactivated.
    private boolean isActive = true;

    // isDeleted is "false" in default state and "true" id the user deleted this account.
    private boolean isDeleted = false;

    // Constructor

    public User(long id, String username, String password)
    {
        this.id = id;
        this.username = username;
        this.password = password;
        // TODO new Profile(this.id);
    }

    // Getter methods

    public Long getId()
    {
        return id;
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

    public String getBio()
    {
        return bio;
    }

    public Date getBirthDate()
    {
        return birthDate;
    }

    public boolean isDeactivated()
    {
        return !isActive;
    }

    public boolean isDeleted()
    {
        return this.isDeleted;
    }

    // Setter methods

    public void setUsername(String username)
    {
        this.username = username;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public void setBio(String bio)
    {
        this.bio = bio;
    }

    public void setBirthDate(Date birthDate)
    {
        this.birthDate = birthDate;
    }

    public void deactivate()
    {
        isActive = false;
    }

    public void reactivate()
    {
        isActive = true;
    }

    public void deleteAccount()
    {
        isDeleted = true;
    }
}
