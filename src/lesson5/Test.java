package lesson5;

public class Test {
    public static void main(String[] args) {
        // class -> object

        Cat cat = new Cat(3);
        Cat cat1 = new Cat(Integer.MAX_VALUE + 3L);
        AngryCat cat2;
        System.out.println(cat.equals(cat1));
        System.out.println(cat);
        System.out.println(cat1);
        System.out.println(cat.hashCode());
        System.out.println(cat1.hashCode());

    }
}
