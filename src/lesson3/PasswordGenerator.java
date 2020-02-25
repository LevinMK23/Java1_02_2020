package lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class PasswordGenerator {

    static String getPassword(Random rnd,
                       char [][] ranges, int [] limits) {
        ArrayList<Character> pass = new ArrayList<>();
        int [] limitsCopy = limits.clone();
        for (int i = 0; i < limitsCopy.length; i++) {
            while (limitsCopy[i] > 0) {
                limitsCopy[i]--;
                pass.add(ranges[i][rnd.nextInt(ranges[i].length)]);
            }
        }
        Collections.shuffle(pass);
        String s = "";
        for (Character ch : pass) s += ch;
        return s;
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        char [] digits = new char[10];
        char [] lowerLatin = new char[26];
        char [] upperLatin = new char[26];
        char [] special = {'.', '_', '@', '#', '$', '&', '%'};
        char [][] ranges = new char[4][];
        for (int i = 0; i < 26; i++) {
            lowerLatin[i] = (char) (i + 'a');
            upperLatin[i] = (char) (i + 'A');
        }
        for (int i = 0; i < 10; i++) {
            digits[i] = (char) (i + '0');
        }
        ranges[0] = digits;
        ranges[1] = lowerLatin;
        ranges[2] = upperLatin;
        ranges[3] = special;
        int [] limits = new int[4];
        for (int i = 0; i < 4; i++) {
            limits[i] = 1 + rnd.nextInt(5);
        }
        //System.out.println(Arrays.deepToString(ranges));
        for (int i = 0; i < 30; i++) {
            System.out.println(getPassword(rnd, ranges, limits));
        }
    }
}
