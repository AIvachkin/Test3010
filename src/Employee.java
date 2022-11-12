import java.util.Objects;

public class Employee {

    private String name;
    private String lastname;
    private int age;

    public Employee(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(lastname, employee.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastname);
    }

    @Override
    public String toString() {
        return "Имя: " + name + '\n' +
                "Фамилия: " + lastname + '\n' +
                "Возраст: " + age;
    }
}
