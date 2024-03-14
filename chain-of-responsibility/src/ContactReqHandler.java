public class ContactReqHandler extends Handler {
    @Override
    public void handle(Message message) {
        if (message.getType() == Message.Type.CONTACT_REQ) {
            System.out.println("Contact Request Handler: request forwarded to the appropriate department.");
        } else {
            this.getNextHandler().handle(message);
        }
    }
}
