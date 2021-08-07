package response.responses.messages;

import response.Response;
import response.ResponseVisitor;

import java.util.List;

public class ViewMessagesPageResponse extends Response
{
    private final List<List<Long[]>> chatsList;

    public ViewMessagesPageResponse(List<List<Long[]>> chatsList)
    {
        this.chatsList = chatsList;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.viewMessagesPage(chatsList);
    }
}
