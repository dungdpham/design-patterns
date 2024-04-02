import java.util.HashMap;

public class Library {
    private HashMap<String, IDocument> documents;

    public Library() {
        documents = new HashMap<>();
    }

    public HashMap<String, IDocument> getDocuments() {
        return documents;
    }

    public void addDocument(Document document) {
        documents.put(document.getUid(), document);
    }

    public void addProtectedDocument(Document document, User user) {
        DocumentProxy documentProxy = new DocumentProxy(document);
        AccessControlService.getInstance().grantAccess(documentProxy, user);

        documents.put(documentProxy.getUid(), documentProxy);
    }
}
