package vegetable;

/**
 * A child class that implements 'prepareSoil' method that can be used by Template method.
 */

public class LargeTomato extends Tomato {

    public LargeTomato(final float height, final float fruitDiameter){
        super(height, fruitDiameter );
    }

    @Override
    protected void prepareSoil() {
        System.out.println("Some fresh compost has been added to the soil in the greenhouse");
    }
}

