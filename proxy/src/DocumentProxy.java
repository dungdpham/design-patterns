import java.nio.file.AccessDeniedException;

public class DocumentProxy implements IDocument {
    private String uid;
    private String creationDate;
    private Document document;

    public DocumentProxy(Document document) {
        this.document = document;
        this.uid = document.getUid();
        this.creationDate = document.getCreationDate();
    }

    @Override
    public String getUid() {
        return uid;
    }

    @Override
    public String getCreationDate() {
        return creationDate;
    }

    @Override
    public String getContent(User user) throws AccessDeniedException {
        if (AccessControlService.getInstance().isAllowed(this, user)) {
            return document.getContent(user);
        } else {
            throw new AccessDeniedException(user.getUsername() + " tried to read document ID " + getUid() +
                    " created at " + getCreationDate() + ": Access Denied!");
        }
    }
}
