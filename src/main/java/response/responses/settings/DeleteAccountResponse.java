package response.responses.settings;

import exceptions.Unauthenticated;
import response.Response;
import response.ResponseVisitor;

public class DeleteAccountResponse extends Response
{
    private final Unauthenticated err;
    private final boolean online;

    public DeleteAccountResponse(boolean online, Unauthenticated err)
    {
        this.err = err;
        this.online = online;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.deleteAccount(online, err);
    }
}
