package lesson8.HomeWork;

public class MainClass {
    public static void main(String[] args) {
        Plate plate = new Plate(50);
//        Cat cat = new Cat("Barsik", 5);
//        plate.info();
//        cat.info();
//        cat.eat(plate);
//        cat.info();
//        plate.info();

        Cat[] catsArray = new Cat[3];
        catsArray[0] = new Cat("Vasya",10);
        catsArray[1] = new Cat("Petya",20);
        catsArray[2] = new Cat("Fedya",30);
        for (int i = 0; i < catsArray.length; i++) {
            System.out.println("Кушает: " + catsArray[i].getName());
            plate.info();
            catsArray[i].eat(plate);
            catsArray[i].info();
        }
        System.out.println("---------");
        plate.info();
        plate.increaseFood(90);
        plate.info();
    }
}
