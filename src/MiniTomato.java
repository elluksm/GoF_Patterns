/**
 * A child class that implements 'prepareSoil' method that can be used by Template method.
 */

public class MiniTomato extends Tomato {

    public MiniTomato(final float height, final float fruitDiameter){
        super(height, fruitDiameter );
    }

    @Override
    protected void prepareSoil() {
        System.out.println("Medium sized pot has been found and some fresh soil put into it");
    }
}
