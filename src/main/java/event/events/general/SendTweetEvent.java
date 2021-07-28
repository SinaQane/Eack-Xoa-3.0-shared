package event.events.general;

import event.Event;
import event.EventVisitor;
import response.Response;

public class SendTweetEvent extends Event
{
    private final SendTweetForm form;

    public SendTweetEvent(SendTweetForm form)
    {
        this.form = form;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.sendTweet(form);
    }
}
