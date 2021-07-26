package response.responses.settings;

import exceptions.Unauthenticated;
import exceptions.settings.SettingsFailed;
import response.Response;
import response.ResponseVisitor;

public class SettingsResponse extends Response
{
    private final Unauthenticated authErr;
    private final SettingsFailed err;
    private final boolean online;

    public SettingsResponse(boolean online, SettingsFailed err, Unauthenticated authErr)
    {
        this.authErr = authErr;
        this.online = online;
        this.err = err;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.settings(online, err, authErr);
    }
}
