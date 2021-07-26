package response.responses.db;

import exceptions.DatabaseError;
import model.Group;
import response.Response;
import response.ResponseVisitor;

public class GetGroupResponse extends Response
{
    private final Group group;
    private final DatabaseError err;

    public GetGroupResponse(Group group, DatabaseError err)
    {
        this.group = group;
        this.err = err;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.getGroup(group, err);
    }
}
