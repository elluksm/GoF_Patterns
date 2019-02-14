import java.util.LinkedList;
import java.util.List;

/**
 * Application entry point.
 *
 * GOF patterns implemented:
 * - Factory method (creational pattern)
 * - Template method (behavioral pattern)
 * -
 * -
 * -
 */
public class Main {

    public static void main(String[] args) throws Exception {

        // This is our vegetable factory object, which we will use to create new vegetables.
        final VegetableFactory vegetableFactory = new VegetableFactory();

        final List<Vegetable> vegetables = new LinkedList<>();

        final Vegetable largeTomato = vegetableFactory.createVegetable(VegetableType.LARGETOMATO, 0.8f, 0.05f);
        vegetables.add(largeTomato);

        final Vegetable miniTomato = vegetableFactory.createVegetable(VegetableType.MINITOMATO, 1.2f, 0.15f);
        vegetables.add(miniTomato);

        final Vegetable pumpkin = vegetableFactory.createVegetable(VegetableType.PUMPKIN, 0.9f);
        vegetables.add(pumpkin);


        // all vegetables we have created
        for (final Vegetable vegetable : vegetables) {
            vegetable.plant();
            vegetable.pickFruits();
            System.out.println();
        }
    }
}