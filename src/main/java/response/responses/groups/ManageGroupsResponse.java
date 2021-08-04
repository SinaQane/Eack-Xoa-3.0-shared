package response.responses.groups;

import exceptions.Unauthenticated;
import response.Response;
import response.ResponseVisitor;

public class ManageGroupsResponse extends Response
{
    private final Unauthenticated err;

    public ManageGroupsResponse(Unauthenticated err)
    {
        this.err = err;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.manageGroup(err);
    }
}
