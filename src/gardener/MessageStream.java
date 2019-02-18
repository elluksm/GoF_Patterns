package gardener;

import java.util.LinkedList;
import java.util.List;
/**
 * And Observable object that can broadcast messages to the Observers that have subscribed to it.
 */

public class MessageStream implements Observable {

    final List<Observer> observers = new LinkedList<>();

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(0);
    }

    /**
     * Public method that allows any message to be broadcasted to observers.
     * @param message Message to broadcast.
     */
    public void broadcast(final String message) {
        observers.forEach(o -> o.update(message));
    }
}
