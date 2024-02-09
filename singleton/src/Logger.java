import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger instance;
    private BufferedWriter writer;
    private final String DEFAULT_NAME = "default_log_file.txt";

    private Logger() {
        try {
            writer = new BufferedWriter(new FileWriter(DEFAULT_NAME));
        } catch (IOException e) {
            handleException(e);
        }
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    public void write(String message) {
        try {
            writer.newLine();
            writer.write(message);
        } catch (IOException e) {
            handleException(e);
        }
    }

    public void setFileName(String fileName) {
        try {
            close();

            writer = new BufferedWriter(new FileWriter(fileName));
        } catch (IOException e) {
            handleException(e);
        }
    }

    public void close() {
        if (writer != null) {
            try {
                    writer.close();
            } catch (IOException e) {
                handleException(e);
            }
        }
    }

    private void handleException(IOException e) {
        System.out.println("Error occurred: " + e.getMessage());
        e.printStackTrace();
    }
}
