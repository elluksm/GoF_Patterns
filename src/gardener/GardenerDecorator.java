package gardener;

public abstract class GardenerDecorator implements Gardener {
    /**
     * Existing Gardener that should be decorated with something new.
     */
    protected Gardener customGardener;

    public GardenerDecorator(Gardener customGardener) {
        this.customGardener = customGardener;
    }

     // By default, we return original Gardener.
    @Override
    public String showDescription() {
        return customGardener.showDescription();
    }
}
