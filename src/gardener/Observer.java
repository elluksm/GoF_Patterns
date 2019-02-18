package gardener;

/**
 * Defines a custom Observer interface with update method which will be used for receiving messages.
 */

public interface Observer {
    /**
     * Update method.
     * @param message Message received.
     */
    void update(String message);
}
