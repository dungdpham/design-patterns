public interface Component {
    void add(Component component);

    void remove(Component component);

    double getSalary();

    String toXML();
}
