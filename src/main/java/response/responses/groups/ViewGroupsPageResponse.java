package response.responses.groups;

import response.Response;
import response.ResponseVisitor;

import java.util.List;

public class ViewGroupsPageResponse extends Response
{
    private final List<List<Long>> groups;

    public ViewGroupsPageResponse(List<List<Long>> groups)
    {
        this.groups = groups;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.viewGroupsPage(groups);
    }
}
