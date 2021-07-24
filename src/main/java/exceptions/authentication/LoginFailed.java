package exceptions.authentication;

public class LoginFailed extends Exception
{
    public LoginFailed(String cause)
    {
        super(cause);
    }
}
