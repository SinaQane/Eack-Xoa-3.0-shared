package response.responses.db;

import exceptions.DatabaseError;
import model.Notification;
import response.Response;
import response.ResponseVisitor;

public class GetNotificationResponse extends Response
{
    private final Notification notification;
    private final DatabaseError err;

    public GetNotificationResponse(Notification notification, DatabaseError err)
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
