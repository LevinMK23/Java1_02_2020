package lesson6.overriding.logging;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class FileLogger implements Logger{

    private File file;
    //file.txt -> project dir
    public FileLogger(String fileName) {
        file = new File(fileName);
        if (!file.exists()) {
            try {
                boolean created = file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void debug(String message) {
        try (PrintWriter out = new PrintWriter(new FileOutputStream(file, true))) {
            out.println("[DEBUG] " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void error(String message) {
        try (PrintWriter out = new PrintWriter(new FileOutputStream(file, true))) {
            out.println("[ERROR] " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
