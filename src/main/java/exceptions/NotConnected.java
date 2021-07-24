package exceptions;

public class NotConnected extends Exception
{
    public NotConnected()
    {
        super("you are not connected to the server to preform this action");
    }
}
