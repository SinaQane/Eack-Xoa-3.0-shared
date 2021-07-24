package exceptions;

public class Unauthenticated extends Exception
{
    public Unauthenticated()
    {
        super("authentication token is not valid");
    }
}
