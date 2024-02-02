public class Employee implements Component {
    public String name;

    public double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(Component component) {}

    @Override
    public void remove(Component component) {}

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public String toXML() {
        return "<Employee name=\"" + name + "\" />\n";
    }
}
