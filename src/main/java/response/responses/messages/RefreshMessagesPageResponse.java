package response.responses.messages;

import response.Response;
import response.ResponseVisitor;

import java.util.List;

public class RefreshMessagesPageResponse extends Response
{
    private final List<List<Long[]>> chatsList;

    public RefreshMessagesPageResponse(List<List<Long[]>> chatsList)
    {
        this.chatsList = chatsList;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.refreshMessagesPage(chatsList);
    }
}
