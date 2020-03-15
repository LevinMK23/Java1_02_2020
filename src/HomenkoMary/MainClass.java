package HomenkoMary;

public class MainClass {

    public static void main(String[] args) {
        Plate plate = new Plate(50);

        Cat[] catsArray = new Cat[3];
        catsArray[0] = new Cat("CatOne",10);
        catsArray[1] = new Cat("CatTwo",20);
        catsArray[2] = new Cat("CatThree",30);
        for (int i = 0; i < catsArray.length; i++) {
            System.out.println("Eat: " + catsArray[i].getName());
            plate.info();
            catsArray[i].eat(plate);
            catsArray[i].info();
        }
        System.out.println("---------");
        plate.info();
        plate.increaseFood(90);
        plate.info();

        Dog dog = new Dog();
        System.out.println("Dog:");
        dog.run(600);
        dog.swim(5);
        dog.jump(0.6);
    }
}
