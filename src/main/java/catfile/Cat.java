package catfile;

import java.util.Objects;

public class Cat {
    private String name;
    private double weight;
    private int frequencyPurr;

    public Cat() {
    }

    public Cat(String name, double weight, int frequencyPurr) {
        this.name = name;
        this.weight = weight;
        this.frequencyPurr = frequencyPurr;
    }



    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", frequencyPurr=" + frequencyPurr +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Double.compare(cat.weight, weight) == 0 && frequencyPurr == cat.frequencyPurr && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, frequencyPurr);
    }
}
