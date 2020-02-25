package lesson3;

import java.io.*;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Input {

    //0. Base InputStream stdin
    //1. Scanner
    //2. BufferedReader

    static int parseInt(byte [] buffer) {
        int value = 0;
        for (int i = 0; i < buffer.length; i++) {
            //ch >= '0' && ch <= '9'
            if (Character.isDigit(buffer[i])) {
                value = value * 10 + buffer[i] - '0';
                if (i == buffer.length-1) {
                    return value;
                }
            } else {
                if (buffer[i] == ' ' || buffer[i] == '\n') {
                    return value;
                } else {
                    throw new InputMismatchException("Cannot parse Int value");
                }
            }
        }
        return 0;
    }

    static void scannerInput(File file) throws FileNotFoundException {
        Scanner in = new Scanner(file);
        while (in.hasNext()) in.next();
    }

    static void bufferedReaderInput(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String s = "";
        while ((s = br.readLine()) != null) {
            //System.out.println(s);
        }
    }

    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        bufferedReaderInput(new File("data.txt"));
        long end = System.currentTimeMillis();
        System.out.println("time = " + (end - start) + " ms.");
    }
}
