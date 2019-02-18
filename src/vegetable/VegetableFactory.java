package vegetable;

public class VegetableFactory {
    /**
     * Factory method which can create specific vegetable based on incoming information.
     */
    public Vegetable createVegetable(final VegetableType type, final float ... params) {
        if (type == VegetableType.LARGETOMATO && params.length == 2) {
            return createLargeTomato(params[0], params[1]);
        }
        else if (type == VegetableType.MINITOMATO && params.length == 2) {
            return createMiniTomato(params[0], params[1]);
        }
        else if (type == VegetableType.PUMPKIN && params.length == 1) {
            return createPumpkin(params[0]);
        }
        else {
            //RuntimeException Thrown on invalid parameter count for provided shape type
            throw new RuntimeException(String.format(
                    "Unknown combination of VegetableType=[%s] and paramCount=[%s]", type.name(), params.length));
        }
    }

    private Vegetable createLargeTomato(final float height, final float fruitDiameter) {
        return new LargeTomato(height, fruitDiameter);
    }

    private Vegetable createMiniTomato(final float height, final float fruitDiameter) {
        return new MiniTomato(height, fruitDiameter);
    }

    private Vegetable createPumpkin(final float fruitDiameter) {
        return new Pumpkin(fruitDiameter);
    }

}