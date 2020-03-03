package lesson5;

public class Cat {
    long a;
    public Cat(long a) {
        //
        this.a = a;
        //
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cat) {
            return ((Cat) obj).a == this.a;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (int) (a % Integer.MAX_VALUE);
    }

    @Override
    public String toString() {
        return String.format("Cat, a = %d", a);
    }
}
