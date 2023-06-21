
import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    private int min;
    private int max;

    public Randoms(int min, int max) {
        random = new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator iterator() {
        return new RandomsIterator();
    }

    private class RandomsIterator implements Iterator<Integer> {

        @Override
        public boolean hasNext() {
            return true; // всегда есть следующий элемент
        }

        @Override
        public Integer next() {
            return random.nextInt((max - min) + 1) + min; // генерируем случайное число в интервале и возвращаем
        }

    }
}

