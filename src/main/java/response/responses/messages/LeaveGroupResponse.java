package response.responses.messages;

import exceptions.Unauthenticated;
import response.Response;
import response.ResponseVisitor;

public class LeaveGroupResponse extends Response
{
    private final Unauthenticated err;

    public LeaveGroupResponse(Unauthenticated err)
    {
        this.err = err;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.leaveGroup(err);
    }
}