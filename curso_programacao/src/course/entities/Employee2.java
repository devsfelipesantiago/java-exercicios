package course.entities;

public class Employee2 {

    private Integer id;
    private String name;
    private Double salary;

    public Employee2() {};

    public Employee2(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage) {
        salary += salary * percentage / 100;
    }

    @Override
    public String toString() {
        return getId()
                +", "
                + name
                +", "
                + String.format("%.2f", salary)
                ;
    }
}
