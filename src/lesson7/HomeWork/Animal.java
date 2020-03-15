package lesson7.HomeWork;

public abstract class Animal {
    boolean result;
    public abstract void run(int distance);
    public abstract void swim(int distance);
    public abstract void jump(double height);
}

class Dog extends Animal {

    @Override
    public void run(int distance) {
        if (distance >= 500) {
            result = false;
        } else {
            result = true;
        }
        System.out.println("  run: " + result);
    }

    @Override
    public void swim(int distance) {
        if (distance >= 10) {
            result = false;
        } else {
            result = true;
        }
        System.out.println("  swim: " + result);
    }

    @Override
    public void jump(double height) {
        if (height >= 0.5) {
            result = false;
        } else {
            result = true;
        }
        System.out.println("  jump: " + result);
    }
}

class Cat extends Animal {

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

class AnimalsApp {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println("Cat:");
        cat.run(10);
        cat.swim(12);
        cat.jump(0.5);
        Dog dog = new Dog();
        System.out.println("Dog:");
        dog.run(600);
        dog.swim(5);
        dog.jump(0.6);
    }
}