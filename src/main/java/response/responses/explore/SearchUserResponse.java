package response.responses.explore;

import response.Response;
import response.ResponseVisitor;

import java.util.List;

public class SearchUserResponse extends Response
{
    private final List<List<Long>> users;

    public SearchUserResponse(List<List<Long>> users)
    {
        this.users = users;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.searchUser(users);
    }
}
