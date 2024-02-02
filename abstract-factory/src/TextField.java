public abstract class TextField extends UIElement {
    public TextField(String text) {
        this.text = text;
    }

    abstract void display();
}
