public abstract class Button extends UIElement {
    public Button(String text) {
        this.text = text;
    }

    abstract void display();
}
