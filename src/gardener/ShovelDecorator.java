package gardener;

/**
 * Adds sharp Shovel to Gardener.
 */

public class ShovelDecorator extends GardenerDecorator {

    public ShovelDecorator(Gardener customGardener) {
        super(customGardener);
    }

    @Override
    public String showDescription() {
        return customGardener.showDescription() + addShovel();
    }

    private String addShovel() {
        return " + with sharp Shovel";
    }
}
