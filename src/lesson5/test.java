package lesson5;

public class test {
    public static void main(String[] args) {
        employee[] impsArray = new employee[5];
        impsArray[0] = new employee("Pertrov Sergey Ivanovish","slave","slave@mc.org","9261234569",15000,30);
        impsArray[1] = new employee("Sidorov Egor Egorovich","junior slave","junior@mc.org","9261234568",5000,20);
        impsArray[2] = new employee("Ezhov Andrey Eldarovich","middle slave","middle@mc.org","9261234567",25000,40);
        impsArray[3] = new employee("Ilysky Alexey Maksimovich","slave lead","lead@mc.org","9261234566",45000,50);
        impsArray[4] = new employee("Ermakov Mikhail Lvovich","slave ceo","ceo@mc.org","9261234565",55000,60);

        impsArray[0].getAllInfo();

        System.out.println("\nEmployeers older than 40: ");
        for (int i = 0; i < impsArray.length; i++) {
            if (impsArray[i].getAge() >= 40) {
                System.out.printf("%s\n",impsArray[i].getFullName());
            }
        }
    }
}
