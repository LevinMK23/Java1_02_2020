package lesson8.HomeWork;

public class Cat {
    private String name;
    private int appetite;
    boolean fill;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void info() {
        System.out.println("fill: " + fill);
    }

    public String getName() {
        return name;
    }

    public void eat(Plate p) {
        int oldValue = p.getFood();
        p.decreaseFood(appetite);
        int newValue = p.getFood();
        if (oldValue != newValue) {
            fill = true;
        }
//        if (p.info() != p.decreaseFood(appetite)) {
//            fill = true;
//        };

    }
}
