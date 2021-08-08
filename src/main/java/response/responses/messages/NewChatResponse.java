package response.responses.messages;

import exceptions.Unauthenticated;
import exceptions.messages.ChatCreationFailed;
import response.Response;
import response.ResponseVisitor;

public class NewChatResponse extends Response
{
    private final Unauthenticated err;
    private final ChatCreationFailed failed;

    public NewChatResponse(Unauthenticated err, ChatCreationFailed failed)
    {
        this.err = err;
        this.failed = failed;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.newChat(err, failed);
    }
}
