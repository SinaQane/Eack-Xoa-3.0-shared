package response.responses.general;

import model.User;
import response.Response;
import response.ResponseVisitor;

import java.util.List;

public class ViewListResponse extends Response
{
    private final String pageKind;
    private final User user;
    private final List<List<Long>> items;

    public ViewListResponse(String pageKind, User user, List<List<Long>> items)
    {
        this.pageKind = pageKind;
        this.user = user;
        this.items = items;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.viewList(pageKind, user, items);
    }
}
