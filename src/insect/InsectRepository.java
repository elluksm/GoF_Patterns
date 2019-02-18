package insect;

/**
* InsectRepository class which implements Aggregate interface.
 * Iterator Pattern
 */

public class InsectRepository implements Aggregate {
    // Array with vegetable insects.
    private String insects[] = {"Colorado Beetles", "Snails", "Cutworms", "Whiteflies"};

    @Override
    public Iterator getIterator() {
        return new InsectIterator();
    }

    /**
     *  InsectIterator class which implements Iterator interface.
     */
    private class InsectIterator implements Iterator {

        private int index = 0;

        @Override
        public boolean hasNext() {
            if(index < insects.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return insects[index++];
        }
    }
}

