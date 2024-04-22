import java.nio.file.AccessDeniedException;
import java.util.ArrayList;
import java.util.List;

public class Recommendation implements Cloneable {
    private String targetAudience;
    private List<Book> books;

    public Recommendation(String targetAudience) {
        this.books = new ArrayList<>();
        this.targetAudience = targetAudience;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    @Override
    public Recommendation clone() {
        try {
            Recommendation clonedRecommendation = (Recommendation) super.clone();
            clonedRecommendation.books = new ArrayList<>();
            for (Book book : this.books) {
                clonedRecommendation.addBook(book.clone());
            }

            return clonedRecommendation;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Recommendation for \"" + targetAudience + "\":\n" + books + "\n";
    }

    public void printList() {
        System.out.println("Recommendation for \"" + targetAudience + "\":");
        if (!books.isEmpty()) {
            for (int i = 0; i < books.size(); i++) {
                System.out.println((i + 1) + ". " + books.get(i).toString());
            }
        } else {
            System.out.println("This recommendation does not have any books yet!");
        }
    }
}
