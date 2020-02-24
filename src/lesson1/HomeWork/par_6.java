package all_in;

public class par_6 {
    static boolean returnDigitalOrientation(int i) {
        if (i < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(returnDigitalOrientation(-5));
    }
}