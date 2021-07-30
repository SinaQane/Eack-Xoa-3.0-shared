package event.events.explore;

import event.Event;
import event.EventVisitor;
import response.Response;

public class SearchUsersEvent extends Event
{
    private final long userId;
    private final String searchedWord;

    public SearchUsersEvent(Long userId, String searchedWord)
    {
        this.userId = userId;
        this.searchedWord = searchedWord;
    }

    @Override
    public Response visit(EventVisitor eventVisitor)
    {
        return eventVisitor.searchUser(userId, searchedWord);
    }
}
