public class GeneralFeedbackHandler extends Handler {
    @Override
    public void handle(Message message) {
        if (message.getType() == Message.Type.GENERAL) {
            System.out.println("General Feedback Handler: feedback received and will be replied ASAP.");
        }
    }
}
