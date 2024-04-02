import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements FileSystemVisitor {
    private String extension;
    private List<File> results;
    private String path = "";

    public SearchVisitor(String extension) {
        this.extension = extension.toLowerCase();
        results = new ArrayList<>();
    }

    @Override
    public void visit(File file) {
        String[] parts = file.getName().split("\\.");
        if (parts.length > 1 && parts[parts.length - 1].toLowerCase().equals(extension)) {
            results.add(file);
            System.out.println(path + file.getName());
        }
    }

    @Override
    public void visit(Directory directory) {
        String prevPath = path;
        path += directory.getName() + "/";

        for (FileSystemElement child : directory.getChildren()) {
            child.accept(this);
        }

        path = prevPath;
    }

    public List<File> getResults() {
        return results;
    }
}
