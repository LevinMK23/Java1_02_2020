package HomenkoMary;

class Cat extends Animal {
    private String name;
    private int appetite;
    boolean satiety;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void info() {
        System.out.println("Cat satiety: " + satiety);
    }

    public String getName() {
        return name;
    }

    public void eat(Plate p) {
        int oldValue = p.getFood();
        p.decreaseFood(appetite);
        int newValue = p.getFood();
        if (oldValue != newValue) {
            satiety = true;
        }
    }

    @Override
    public void run(int distance) {
        if (distance >= 200) {
            result = false;
        } else {
            result = true;
        }
        System.out.println("  run: " + result);
    }

    @Override
    public void swim(int distance) {
        result = false;
        System.out.println("  swim: " + result);
    }

    @Override
    public void jump(double height) {
        if (height >= 2) {
            result = false;
        } else {
            result = true;
        }
        System.out.println("  jump: " + result);
    }
}