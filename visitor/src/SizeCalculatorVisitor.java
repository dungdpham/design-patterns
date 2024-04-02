public class SizeCalculatorVisitor implements FileSystemVisitor {
    private double sizeTotal = 0;
    private String path = "";

    @Override
    public void visit(File file) {
        sizeTotal += file.getSize();
        System.out.println(path + file.getName() + " (" + file.getSize() + "MB)");
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

    public double getSizeTotal() {
        return sizeTotal;
    }
}
