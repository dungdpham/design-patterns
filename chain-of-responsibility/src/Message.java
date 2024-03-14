public class Message {
    public enum Type {COMPENSATION, CONTACT_REQ, SUGGESTION, GENERAL}

    private Type type;
    private String content;
    private String senderEmail;

    public Message(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public String getContent() {
        return content;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }
}
