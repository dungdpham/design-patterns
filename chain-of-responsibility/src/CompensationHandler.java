public class CompensationHandler extends Handler {
    @Override
    public void handle(Message message) {
        if (message.getType() == Message.Type.COMPENSATION) {
            System.out.println("Compensation Handler: claim received. Waiting for review and approval.");
        } else {
            this.getNextHandler().handle(message);
        }
    }
}
