package exceptions.tweet;

public class ForwardFailed extends Exception
{
    public ForwardFailed(String cause)
    {
        super(cause);
    }
}
