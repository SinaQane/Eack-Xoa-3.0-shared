package exceptions;

public class DatabaseError extends Error
{
    public DatabaseError(String cause)
    {
        super(String.format("couldn't connect to the db table %s", cause));
    }
}
