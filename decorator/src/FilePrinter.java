import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter extends PrinterDecorator {
    private BufferedWriter bufferedWriter;

    private final String FILE_NAME = "printed_message.txt";

    public FilePrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String message) {
        //super.print(message);

        try {
            bufferedWriter = new BufferedWriter(new FileWriter(FILE_NAME));
            bufferedWriter.write(message);
            bufferedWriter.close();
            System.out.println("'" + message + "' printed to '" + FILE_NAME + "'");
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
