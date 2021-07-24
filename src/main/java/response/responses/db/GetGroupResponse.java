package response.responses.db;

import model.Group;
import response.Response;
import response.ResponseVisitor;

public class GetGroupResponse extends Response
{
    private final Group group;

    public GetGroupResponse(Group group)
    {
        this.group = group;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.getGroup(group);
    }
}
