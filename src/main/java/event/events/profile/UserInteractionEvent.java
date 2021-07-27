package event.events.profile;

import event.Event;
import event.EventVisitor;
import response.Response;

public class UserInteractionEvent extends Event
{
    // interaction can be "change follow status", "block" and "mute"
    private final String interaction;
    private final String authToken;
    private final long otherUserId;
    private final long userId;

    public UserInteractionEvent(String interaction, Long userId, Long otherUserId, String authToken)
    {
        this.userId = userId;
        this.otherUserId = otherUserId;
        this.interaction = interaction;
        this.authToken = authToken;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.userInteraction(interaction, userId, otherUserId, authToken);
    }
}
