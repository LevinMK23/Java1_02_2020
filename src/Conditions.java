public class Conditions {
    public static void main(String[] args) {
        int a = 30, b = 4;
        // <, <=, >, >=, ==, !=
        boolean flag = true;
        if (a > b && flag) {
            System.out.println("OK");
        } else {
            System.out.println("WRONG");
        }
        //a = 30, b = 4
        a = a < b ? a : b;
        if (a < b) {
            a = a;
        } else {
            a = b;
        }
        //30 < 4 false -> a = b
        //3 < 4 true -> a = a
        //cond ? actionTrue : actionFalse
        System.out.println(a);
    }
}
