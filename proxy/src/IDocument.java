import java.nio.file.AccessDeniedException;

public interface IDocument {
    String getUid();
    String getCreationDate();
    String getContent(User user) throws AccessDeniedException;
}
