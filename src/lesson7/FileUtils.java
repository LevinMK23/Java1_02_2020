package lesson7;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FileUtils {

    static File createFile(String fileName) throws IOException {
        File file = new File(fileName);
        if (!file.exists()) {
            boolean created = file.createNewFile();
        }
        return file;
    }

    static void write1(File file, int value, int len) throws IOException {
        FileOutputStream out = new FileOutputStream(file, false);
        for (int i = 0; i < len; i++) {
            out.write(value);
        }
    }

    static void write2(File file, int value, int len) throws IOException {
        FileOutputStream out = new FileOutputStream(file, false);
        for (int i = 0; i < len / 10000; i++) {
            byte [] buffer = new byte[10000];
            Arrays.fill(buffer, (byte)value);
            out.write(buffer);
        }
    }

    static void writeBuffered(File file, int value) throws FileNotFoundException {
        PrintWriter out =
                new PrintWriter(file);
        for (int i = 0; i < 1000000; i++) {
            out.println(value);
        }
        out.close();
    }

    static void bufferedInput(File inputFile) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        String line = "";
        StringTokenizer tokens = new StringTokenizer(reader.readLine());
        while (!(reader.readLine()).isEmpty()) {}
    }

    static void scannerInput(File inputFile) throws FileNotFoundException {
        Scanner in = new Scanner(inputFile);
        while (in.hasNext()) in.next();
    }

    public static void main(String[] args) throws IOException {
        File file = createFile("wap.txt");
//        long start = System.currentTimeMillis();
//        write1(file, 'a', 1000000);
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);
//        start = System.currentTimeMillis();
//        writeBuffered(file, 'a');
//        end = System.currentTimeMillis();
//        System.out.println(end - start);
        System.out.println(file.length());
        long start = System.currentTimeMillis();
        scannerInput(file);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        start = System.currentTimeMillis();
        bufferedInput(file);
        end = System.currentTimeMillis();
        System.out.println(end - start);
    }

}
