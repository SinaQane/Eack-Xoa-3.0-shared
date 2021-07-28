package response.responses;

import response.Response;
import response.ResponseVisitor;

public class Pong extends Response
{
    @Override
    public void visit(ResponseVisitor responseVisitor)
    {
        String pong = "pong";
        responseVisitor.pong(pong);
    }
}
