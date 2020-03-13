package lesson7;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

public class StringUtils {

    static void wordsCount() {
        TreeMap<String, Integer> map = new TreeMap<>();
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String word = in.next();
            word = word.toLowerCase().replaceAll("[^a-z+]", "");
            if (!word.isEmpty()) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        map.entrySet()
                .stream()
                .sorted(Comparator.comparingInt(o -> -o.getValue()))
                .forEach(pair -> System.out.println(pair.getKey() + " : " + pair.getValue()));
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        StringBuilder s = new StringBuilder(); // s1 = "aaaaa" s2 = "a" s3 = concat(s1, s2)
        // 3.5 Ghz * 4 12 billion iteration per second
        //10^6 * 10^6 = 10^12
        for (int i = 0; i < 100000; i++) {
            s.append("a");
        }
        long end = System.currentTimeMillis();
        System.out.println("time: " + (end - start) + " ms.");
    }
}
