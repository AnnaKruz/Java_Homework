
public class EmployeeMain {
    public static void main(String[] args) {
        Employee person1 = new Employee(20, "Ivan", "Petrov", 30.5);
        Employee person2 = new Employee(10, "Ivan", "Petrov", 30.5);
        System.out.println(person1.getFullName());
        person1.upgrade(50);
        System.out.println(person1.toString());
        System.out.println(person2.olderThen(person1));
        
    }
}
