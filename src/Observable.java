/**
 * Defines custom 'Observable' interface that can add or remove Observers.
 */

public interface Observable {
    /**
     * Adds observer.
     */
    void addObserver(Observer o);

    /**
     * Removes observer.
     */
    void removeObserver(Observer o);
}
