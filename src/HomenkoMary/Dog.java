package HomenkoMary;

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
