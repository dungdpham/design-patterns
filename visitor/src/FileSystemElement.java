public interface FileSystemElement {
    String getName();
    void accept(FileSystemVisitor visitor);
}
