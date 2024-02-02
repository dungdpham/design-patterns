public abstract class UIElement {
    public String text;

    public void setText(String text) {
        this.text = text;
    }

    abstract void display();
}
