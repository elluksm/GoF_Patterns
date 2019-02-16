/**
 * Adds education in gardening for Gardener.
 */


public class EducationDecorator extends GardenerDecorator {
    public EducationDecorator(Gardener customGardener) {
        super(customGardener);
    }

    @Override
    public String showDescription() {
        return customGardener.showDescription() + addEducation();
    }

    private String addEducation() {
        return " + with higher education in gardening";
    }
}
