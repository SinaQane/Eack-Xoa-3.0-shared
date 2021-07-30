package exceptions.authentication;

public class LogoutFailed extends Exception
{
    public LogoutFailed(String cause)
    {
        super(cause);
    }
}
