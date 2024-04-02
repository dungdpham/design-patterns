import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory download = new Directory("Download");
        Directory myDoc = new Directory("My_Document");
        Directory images = new Directory("Images");
        Directory music = new Directory("Music");

        File readme = new File("readme.txt", 0.2);
        File resume = new File("Resume.pdf", 1.4);
        File coverLetter = new File("Cover_Letter.pdf", 0.9);
        File profilePic = new File("Profile_Picture.jpg", 0.81);
        File certificate = new File("Certificate.pdf", 2.1);
        File readmeCopy = new File("readme(1).txt", 0.2);

        images.add(profilePic);
        download.add(images);
        download.add(music);
        download.add(certificate);
        download.add(readmeCopy);
        myDoc.add(resume);
        myDoc.add(coverLetter);
        root.add(download);
        root.add(myDoc);
        root.add(readme);

        SizeCalculatorVisitor sizeCalculatorVisitor = new SizeCalculatorVisitor();
        root.accept(sizeCalculatorVisitor);
        System.out.println("File size total: " + sizeCalculatorVisitor.getSizeTotal() + "MB");

        System.out.println();

        SearchVisitor searchVisitorPdf = new SearchVisitor("PDF");
        root.accept(searchVisitorPdf);
        System.out.print("PDF files: " +
                searchVisitorPdf.getResults().stream().map(File::getName).collect(Collectors.joining(", ")));
    }
}
