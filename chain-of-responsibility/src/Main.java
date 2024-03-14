public class Main {
    public static void main(String[] args) {
        Handler compensationHandler = new CompensationHandler();
        Handler contactReqHandler = new ContactReqHandler();
        Handler suggestionHandler = new SuggestionHandler();
        Handler generalFeedbackHandler = new GeneralFeedbackHandler();

        compensationHandler.setNextHandler(contactReqHandler);
        contactReqHandler.setNextHandler(suggestionHandler);
        suggestionHandler.setNextHandler(generalFeedbackHandler);

        Message message1 = new Message(Message.Type.COMPENSATION);
        message1.setContent("Some claim.");
        message1.setSenderEmail("mail@email.com");

        Message message2 = new Message(Message.Type.CONTACT_REQ);
        message2.setContent("Give me contact");
        message2.setSenderEmail("my@email.com");

        Message message3 = new Message(Message.Type.SUGGESTION);
        message3.setContent("This is what I think");

        Message message4 = new Message(Message.Type.GENERAL);
        message4.setContent("This is good");

        compensationHandler.handle(message4);
        compensationHandler.handle(message2);
        compensationHandler.handle(message1);
        compensationHandler.handle(message3);
    }
}
