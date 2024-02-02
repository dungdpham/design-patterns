public class Main {
    public static void main(String[] args) {
        UIFactory uiFactory = new AFactory();
        //UIFactory uiFactory = new BFactory();

        Button button = uiFactory.createButton("CONFIRM");
        TextField textField = uiFactory.createTextField("Please choose 1 option:");
        Checkbox checkbox1 = uiFactory.createCheckbox("option 1");
        Checkbox checkbox2 = uiFactory.createCheckbox("option 2");

        textField.display();
        checkbox1.display();
        checkbox2.display();
        button.display();

        System.out.println();
        textField.setText("This is new text:");
        checkbox1.setText("New option 1");
        checkbox2.setText("New option 2");
        button.setText("CONFIRM AGAIN");

        textField.display();
        checkbox1.display();
        checkbox2.display();
        button.display();
    }
}
