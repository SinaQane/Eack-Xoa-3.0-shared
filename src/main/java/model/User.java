package model;

import java.util.Date;

public class User
{
    private Long id;
    private String username;
    private String password;
    private String name;
    private String email;
    private String phoneNumber;
    private String bio;
    private Date birthDate;

    // isActive is "true" if the page is active and "false" if it's deactivated.
    private boolean isActive = true;
    // isDeleted is "false" in default state and "true" id the user deleted this account.
    private boolean isDeleted = false;

    public User() {}

    public User(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getBio()
    {
        return bio;
    }

    public void setBio(String bio)
    {
        this.bio = bio;
    }

    public Date getBirthDate()
    {
        return birthDate;
    }

    public void setBirthDate(Date birthDate)
    {
        this.birthDate = birthDate;
    }

    public boolean isActive()
    {
        return isActive;
    }

    public void setActive(boolean active)
    {
        isActive = active;
    }

    public boolean isDeactivated()
    {
        return !isActive;
    }

    public void deactivate()
    {
        isActive = false;
    }

    public void reactivate()
    {
        isActive = true;
    }

    public boolean isDeleted()
    {
        return isDeleted;
    }

    public void setDeleted(boolean isDeleted)
    {
        this.isDeleted = isDeleted;
    }

    public void deleteAccount()
    {
        isDeleted = true;
    }
}
