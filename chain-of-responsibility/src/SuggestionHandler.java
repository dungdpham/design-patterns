public class SuggestionHandler extends Handler {
    @Override
    public void handle(Message message) {
        if (message.getType() == Message.Type.SUGGESTION) {
            System.out.println("Development Suggestion Handler: suggestion logged and will be reviewed ASAP.");
        } else {
            this.getNextHandler().handle(message);
        }
    }
}
