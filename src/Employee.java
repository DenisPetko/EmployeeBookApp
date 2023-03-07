import java.util.Arrays;

public class Employee {
    private String fullName;
    private int department;
    private int salary;
    private final int id;
    static int count = 0;

    public String getFullName() {
        return this.fullName;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void printEmployee (Employee[] employees) {
        System.out.println(Arrays.toString(employees));
    }
    public static void findSumSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary(); //
        }
        System.out.println("" + sum);
    }
    public static void indexOn (Employee[] employees, double index) {
        for (Employee employee : employees) {
            employee.setSalary((int) (employee.getSalary()*index));
        }
        System.out.println(Arrays.toString(employees));
    }

    @Override
    public String toString() {
        return "Работник: " + fullName +
                ", отдел: " + department +
                ", зарплата: " + salary +
                ", id=" + id +
                ';';
    }

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = count;
        count++;
    }


}
