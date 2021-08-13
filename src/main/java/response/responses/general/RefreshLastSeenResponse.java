package response.responses.general;

import response.Response;
import response.ResponseVisitor;

public class RefreshLastSeenResponse extends Response
{
    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.refreshLastSeen();
    }
}
