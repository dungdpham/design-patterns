import java.sql.Timestamp;

public class Document implements IDocument {
    private String uid;
    private String creationDate;
    private String content;

    public Document(String uid, String content) {
        this.uid = uid;
        this.creationDate = new Timestamp(System.currentTimeMillis()).toString();
        this.content = content;
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
    public String getContent(User user) {
        return content;
    }
}
