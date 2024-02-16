public class Main {
    public static void main(String[] args) {
        Printer basicPrinter = new BasicPrinter();
        basicPrinter.print("Hello World!");

        System.out.println();
        Printer filePrinter = new FilePrinter(new BasicPrinter());
        filePrinter.print("Hello!");

        System.out.println();
        Printer encryptedPrinter = new EncryptedPrinter(new BasicPrinter());
        encryptedPrinter.print("HelloWORLD!");

        System.out.println();
        Printer encryptedFilePrinter = new EncryptedPrinter(new FilePrinter(new BasicPrinter()));
        encryptedFilePrinter.print("Hello World!");
    }
}
