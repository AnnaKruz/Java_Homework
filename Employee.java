import java.util.Objects;

public class Employee {
    int age;
    String firstName;
    String lastName;
    double salary;
    
    public Employee(int age, String firstName, String lastName) {
        this(age, firstName, lastName, 50.0);
    }

    public Employee(int age, String firstName, String lastName, double salary) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee person) {
            return firstName.equals(person.firstName) && lastName.equals(person.lastName);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return "Сотрудник: " + firstName + " " + lastName + ", возраст: " + age + ", оклад: " + salary;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

   
    public boolean olderThen(Employee e) {
        if (age > e.age) {
            return true;
        }
        return false;        
    }

    public void upgrade(double upSalary) {
        this.salary = salary + upSalary;
    }


}
