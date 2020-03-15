package HomenkoMary;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        if (n < food) {
            food -= n;
        }
    }

    public void increaseFood(int n) {
        System.out.println("Added food to the plate: " + n);
        food += n;
    }

    public int getFood() {
        return food;
    }

    public void info() {
        System.out.println(food + " food in a plate");
    }
}
