package lesson5;

public class Ex2 {
    public static void main(String[] args) {
        AngryCat cat = new AngryCat("Vaska", 5);
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        cat.say();
        for (int i = 0; i < 5; i++) {
            cat = new AngryCat("Cat", i);
            System.out.println(cat.getId());
        }
        System.out.println(cat.getCounter());
        //Права доступа
        // private - толко внутри класса
        // _ - внутри пакета(папки с файлами)
        // protected - _ + по наследству
        // public - везде
        // классификаторы:
        // static, final, abstract, transient, volatile, native
        final int x = 12;

    }
}
