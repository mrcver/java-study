package strategy;

/**
 * @author tim
 */
public class Cat implements java.lang.Comparable {
    private int weight;

    public Cat(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Object o) {
        Cat c = (Cat) o;
        if (c.weight > this.weight) {
            return 1;
        } else if (this.weight > c.weight) {
            return -1;
        } else {
            return 0;
        }

    }
}
