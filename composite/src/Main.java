public class Main {
    public static void main(String[] args) {
        Component organization = new Department("Organization");
        Component marketing = new Department("Marketing");
        Component csc = new Department("Customer Service");
        organization.add(marketing);
        organization.add(csc);

        Component ceo = new Employee("CEO", 10000);
        organization.add(ceo);
        organization.add(new Employee("COO", 8000));

        marketing.add(new Employee("Bruce", 5000));
        marketing.add(new Employee("Clark", 4800));

        csc.add(new Employee("Hal", 5200));
        Component techSupport = new Department("Tech Support");
        csc.add(techSupport);
        techSupport.add(new Employee("Saturn", 3500));
        techSupport.add(new Employee("Jupiter", 4200));

        System.out.println();
        System.out.println(organization.toXML());
        System.out.println("Total salary: " + organization.getSalary());

        organization.remove(ceo);
        Component newEmployee = new Employee("Mars", 4500);
        csc.add(newEmployee);

        System.out.println();
        System.out.println(organization.toXML());
        System.out.println("Total salary: " + organization.getSalary());
    }
}
