package response.responses.db;

import model.Notification;
import response.Response;
import response.ResponseVisitor;

public class GetNotificationResponse extends Response
{
    private final Notification notification;

    public GetNotificationResponse(Notification notification)
    {
        this.notification = notification;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        responseVisitor.getNotification(notification);
    }
}
