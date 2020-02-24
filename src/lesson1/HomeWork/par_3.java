package all_in;

public class par_3 {
    static void expression(double a, double b, double c, double d) {
        double result = a * (b + (c / d));
        System.out.println(result);
    }

    public static void main(String[] args) {
        expression(1,2,3,4);
    }
}
