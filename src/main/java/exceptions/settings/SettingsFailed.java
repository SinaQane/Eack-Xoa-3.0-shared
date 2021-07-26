package exceptions.settings;

public class SettingsFailed extends Exception
{
    public SettingsFailed(String cause)
    {
        super(cause);
    }
}
