import java.util.Arrays;

public class Employee {
    private String fullName;
    private int department;
    private int salary;
    private final int id;
    private static int count = 0;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = count;
        count++;
    }

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

    //Список всех сотрудников со всеми имеющимися по ним данными
    /*public static void printEmployee(Employee[] employees) {
        System.out.println("Данные по всем сотрудникам " + Arrays.toString(employees));
    }

    //Сумма затрат на зарплаты в месяц
    public static int findSumSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary(); //
        }
        return sum;
    }

    //поиск сотрудника с минимальной зарплатой
    public static Employee findMinSalary(Employee[] employees) {
        int minSalary = Integer.MAX_VALUE;
        Employee employeeMinSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                employeeMinSalary = employee;
            }
        }
        return employeeMinSalary;
    }

    //поиск сотрудника с максимальной зарплатой
    public static Employee findMaxSalary(Employee[] employees) {
        int maxSalary = Integer.MIN_VALUE;
        Employee employeeMaxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                employeeMaxSalary = employee;
            }
        }
        return employeeMaxSalary;
    }

    //Среднее значение зарплат
    public static int findAverageSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary(); //
        }
        return sum / employees.length;
    }

    //ФИО всех сотрудников
    public static void printFullNameEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    //Проиндексировать зарплату
    public static void printIndexSalary(Employee[] employees, double index) {
        for (Employee employee : employees) {
            employee.setSalary((int) (employee.getSalary() * index));
        }
        System.out.println("Индексация зарплаты " + Arrays.toString(employees));
    }

    //Сотрудник отдела с минимальной зарплатой
    public static Employee findEmployeeDepartmentMinSalary(Employee[] employees, int department) {
        int minSalary = Integer.MAX_VALUE;
        Employee findEmployee = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
                continue;
            }
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                findEmployee = employee;
            }
        }
        return findEmployee;
    }

    //Сотрудник отдела с максимальной зарплатой
    public static Employee findEmployeeDepartmentMaxSalary(Employee[] employees, int department) {
        int minSalary = Integer.MIN_VALUE;
        Employee findEmployee = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
                continue;
            }
            if (employee.getSalary() > minSalary) {
                minSalary = employee.getSalary();
                findEmployee = employee;
            }
        }
        return findEmployee;
    }

    //Сумма затрат на зарплату по отделу
    public static int findSumSalaryOfDepartment(Employee[] employees, int department) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
                continue;
            }
            sum += employee.getSalary(); //
        }
        return sum;
    }

    //Средняя зарплата по отделу
    public static int findAverageSalaryOfDepartment(Employee[] employees, int department) {
        int sum = 0;
        int countEmployeeOfDepartment = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
            sum += employee.getSalary();
            countEmployeeOfDepartment++;
            }
        }
        return sum / countEmployeeOfDepartment;
    }

    //Проиндексировать зарплату сотрудников отдела
    public static void printIndexSalaryEmployeeOfDepartment(Employee[] employees, int department, double index) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                employee.setSalary((int) (employee.getSalary() * index));
                System.out.println("Индексация зарплаты по отделу " + employee);
            }
        }
    }

    //Напечатать всех сотрудников отдела
    public static void printEmployeeOfDepartment(Employee[] employees, int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println("Сотрудники по отделу " + "ФИО: " + employee.getFullName() + " Зарплата: " + employee.getSalary() + " id: " + employee.getId());
            }
        }
    }

    //Все сотрудники с зарплатой меньше или больше(равно) заданного числа
    public static void printSomeEmployee(Employee[] employees, int number) {
        for (Employee employee : employees) {
            if (employee.getSalary() < number) {
                System.out.println("Зарплата меньше заданной " + " id: " + employee.getId() + " ФИО: " + employee.getFullName() + " Зарплата: " + employee.getSalary());
            }
            if (employee.getSalary() >= number) {
                System.out.println("Зарплата больше заданной " + " id: " + employee.getId() + " ФИО: " + employee.getFullName() + " Зарплата: " + employee.getSalary());
            }
        }
    }*/


    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }


}
