import java.nio.file.AccessDeniedException;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        User superUser = new User("Super user");
        User normalUser = new User("Normal user");

        Library library = new Library();

        library.addDocument(new Document("A1", "General knowledge..."));
        library.addProtectedDocument(new Document("S99", "Important information..."), superUser);

        try {
            for (Map.Entry<String, IDocument> entry : library.getDocuments().entrySet()) {
                System.out.println(superUser.getUsername() + " found document ID " + entry.getKey() + " created at "
                        + entry.getValue().getCreationDate() + ", it read: " + entry.getValue().getContent(superUser));
                System.out.println(normalUser.getUsername() + " found document ID " + entry.getKey() + " created at "
                        + entry.getValue().getCreationDate() + ", it read: " + entry.getValue().getContent(normalUser));
                System.out.println();
            }
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }
    }
}
