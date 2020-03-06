package lesson6.overriding.logging;

public class ConsoleLogger implements Logger {

    @Override
    public void debug(String message) {
        System.err.println("[DEBUG] " + message);
    }

    @Override
    public void error(String message) {
        System.err.println("[ERROR] " + message);
    }
}
