public class Functions {

    static void funcName(int param1, int param2) {
        System.out.println(param1 + param2);
    }

    static void foo(int n) {
        while (true) {
            System.out.println(n);
            return;
        }
    }

    static long sum(long a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        funcName(3, 4);
        long res = sum(15, 20);
        System.out.println(sum(15, 20));
        foo(5);
    }
}
