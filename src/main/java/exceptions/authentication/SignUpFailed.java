package exceptions.authentication;

public class SignUpFailed extends Exception
{
    public SignUpFailed(String cause)
    {
        super(cause);
    }
}
