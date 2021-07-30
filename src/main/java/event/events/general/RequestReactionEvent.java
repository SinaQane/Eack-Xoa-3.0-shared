package event.events.general;

import event.Event;
import event.EventVisitor;
import response.Response;

public class RequestReactionEvent extends Event
{
    // interaction can be "accept", "good reject" and "bad reject"
    private final String reaction;
    private final String authToken;
    private final long notificationId;

    public RequestReactionEvent(String reaction, long notificationId, String authToken)
    {

        this.reaction = reaction;
        this.authToken = authToken;
        this.notificationId = notificationId;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.requestReaction(reaction, notificationId, authToken);
    }
}
