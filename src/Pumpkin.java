/**
 * Pumpkin class which implements and overrides methods from Vegetable interface.
 */

public class Pumpkin implements Vegetable {

    private final float fruitDiameter;

    public Pumpkin(float fruitDiameter) {
        this.fruitDiameter = fruitDiameter;
    }

    public void plant() {
        System.out.println("Pumpkin is planted in the garden");
    }

    public void pickFruits() {
        System.out.println("Picking pumpkin fruits in the late autumn");
    }
}