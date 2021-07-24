package response.responses.db;

import model.Notification;
import response.Response;
import response.ResponseVisitor;

public class GetNotificationResponse extends Response
{
    private final Notification notification;
    private final Exception err;

    public GetNotificationResponse(Notification notification, Exception err)
    {
        this.notification = notification;
        this.err = err;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.getNotification(notification, err);
    }
}
