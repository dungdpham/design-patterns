import java.util.ArrayList;
import java.util.List;

public class Department implements Component {
    public String name;
    public List<Component> components;

    public Department(String name) {
        this.name = name;
        components = new ArrayList<>();
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public double getSalary() {
        double salary = 0;

        for (Component component : components) {
            salary += component.getSalary();
        }

        return salary;
    }

    @Override
    public String toXML() {
        StringBuilder xmlTree = new StringBuilder();

        xmlTree.append("<Department name=\"").append(name).append("\">\n");
        for (Component component : components) {
            xmlTree.append(component.toXML());
        }
        xmlTree.append("</Department>\n");
        return xmlTree.toString();
    }
}
