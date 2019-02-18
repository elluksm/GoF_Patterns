import gardener.*;
import insect.InsectRepository;
import insect.Iterator;
import vegetable.Vegetable;
import vegetable.VegetableFactory;
import vegetable.VegetableType;

import java.util.LinkedList;
import java.util.List;

/**
 * Application entry point.
 *
 * GOF patterns implemented:
 * - Factory method (creational pattern)
 * - Template method (behavioral pattern)
 * - Iterator Pattern (behavioral pattern)
 * - Decorator (structural pattern)
 * - Observer (behavioral pattern)
 */
public class Main {

    public static void main(String[] args) throws Exception {
        /**
        * This is our vegetable factory object, which we will use to create new vegetables.
         */
        final VegetableFactory vegetableFactory = new VegetableFactory();

        final List<Vegetable> vegetables = new LinkedList<>();

        final Vegetable pumpkin = vegetableFactory.createVegetable(VegetableType.PUMPKIN, 0.9f);
        vegetables.add(pumpkin);

        /**
         * Tomatoes (Template method)
         */
        final Vegetable largeTomato = vegetableFactory.createVegetable(VegetableType.LARGETOMATO, 0.8f, 0.05f);
        vegetables.add(largeTomato);

        final Vegetable miniTomato = vegetableFactory.createVegetable(VegetableType.MINITOMATO, 1.2f, 0.15f);
        vegetables.add(miniTomato);

        // all vegetables we have created
        for (final Vegetable vegetable : vegetables) {
            vegetable.plant();
            vegetable.pickFruits();
            System.out.println();
        }

        /**
         * Decorator example
         */
        Gardener gardener = new SimpleGardener("Lili");
        System.out.println(gardener.showDescription());

        Gardener otherGardener = new SimpleGardener("Olivia");
        System.out.println(otherGardener.showDescription());

        // Let's add a shovel for both gardeners
        gardener = new ShovelDecorator(gardener);
        System.out.println(gardener.showDescription());

        otherGardener = new ShovelDecorator(otherGardener);
        System.out.println(otherGardener.showDescription());

        // And some education for one of gardeners
        otherGardener = new EducationDecorator(otherGardener);
        System.out.println(otherGardener.showDescription());
        System.out.println();

        /**
         * Observer example
         */
        // create a message stream that will broadcast messages.
        final MessageStream messageStream = new MessageStream();

        // create and attach a couple of listeners
        System.out.println("   --- Registering listeners Sophia, Sara and Anna ---");
        final SimpleGardener sophia = new SimpleGardener("Sophia");
        final SimpleGardener anna = new SimpleGardener("Anna");
        final SimpleGardener sara = new SimpleGardener("Sara");

        messageStream.addObserver(sophia);
        messageStream.addObserver(anna);
        messageStream.addObserver(sara);

        System.out.println("   --- Broadcasting Messages 1 ---");
        messageStream.broadcast("Today it is warm and sunny!");
        messageStream.broadcast("Go and plant something in your garden!");
        System.out.println();

        // unsubscribe Sophia
        System.out.println("   --- Unregistering listener Sophia ---");
        messageStream.removeObserver(sophia);
        System.out.println();

        System.out.println("   --- Broadcasting Messages 2 ---");
        messageStream.broadcast("That's all for today.");
        System.out.println();

        /**
         * Iterator
         */
        InsectRepository insectRepository = new InsectRepository();
        Iterator iterator = insectRepository.getIterator();

        // Iterator output.
        while (iterator.hasNext()) {
            System.out.println("Keep " + iterator.next() + " out of your vegetable garden!" );
        }
    }

}