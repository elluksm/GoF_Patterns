
/**
 * Tomato class which implements Vegetable interface.
 * Template method
 */
public abstract class Tomato implements Vegetable {

    private final float height;
    private final float fruitDiameter;



    public Tomato(final float height, final float fruitDiameter){
        this.height = height;
        this.fruitDiameter = fruitDiameter;
    }

    public void plant() {
        prepareSoil();
        System.out.println("Putting the plant in the soil and watering it with warm water!");
        System.out.println("Tomato is planted.");
    }

    public void pickFruits() {
        System.out.println("Checking for red fruits every two days");
    }

    protected abstract void prepareSoil();
}