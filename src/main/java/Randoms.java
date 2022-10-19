import java.util.Iterator;

public class Randoms implements Iterable<Integer> {
    private int min;
    private int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public class ItemsIterator implements Iterator<Integer> {
        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            int result = rnd(min, max);
            return result;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ItemsIterator();
    }

    public int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

}
