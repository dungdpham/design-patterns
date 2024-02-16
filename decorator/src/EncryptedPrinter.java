import java.util.Base64;

public class EncryptedPrinter extends PrinterDecorator {
    public EncryptedPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String message) {
        String encodedMessage = Base64.getEncoder().encodeToString(message.getBytes());
        super.print(encodedMessage);

        // Decoder
        //byte[] decodedBytes = Base64.getDecoder().decode(encodedMessage);
        //String decodedMessage = new String(decodedBytes);
        //System.out.println(decodedMessage);
    }
}
