package all_in;

public class par_4 {
    static boolean returnResultIfSum(int x, int y) {
        int summ = x + y;
        if (summ > 10 && summ <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(returnResultIfSum(5,15));
    }
}
