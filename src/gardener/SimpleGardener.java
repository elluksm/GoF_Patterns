package gardener;

/**
 * Represents a simple Gardener. This is a base class for all Gardeners.
 * A Gardener who may observe messages sent from various Observables (e.g., MessageStream).
 */

public class SimpleGardener implements Gardener, Observer {

    private final String name;

    public SimpleGardener(final String name) {
        this.name = name;
    }

    @Override
    public String showDescription() {
        return "Gardener " + name;
    }

    /**
     * This method will get called whenever a message is sent by Observable (e.g., MessageStream).
     * @param message Message received.
     */
    @Override
    public void update(String message) {
        System.out.println(name + " just received new message: [" + message + "]");
    }
}
