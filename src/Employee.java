import java.util.List;

public class Employee {
    String name;
    Long salary;

    public String getName() {
        return name;
    }

    public Long getSalary() {
        return salary;
    }

    public Employee(String name, Long salary) {
        this.name = name;
        this.salary = salary;
    }

    public static long calcNumberOfEmployees(List<Department> departments, long threshold) {
        return departments.stream()
                .filter(x -> x.getCode()
                        .startsWith("111-"))
                .flatMap(x -> x.getEmployees()
                        .stream())
                .filter(x -> x.getSalary() >= threshold)
                .count();
    }
}
