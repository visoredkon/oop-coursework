package my.coursework.digitallibrary;

import java.util.logging.Logger;

public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());

    private static void print(String log) {
        logger.info(log);
    }

    public static void main(String[] args) {
        print("Hello, World!");
    }
}
