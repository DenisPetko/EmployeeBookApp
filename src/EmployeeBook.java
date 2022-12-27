import java.util.Arrays;

public class EmployeeBook {

    private final int sizeBook = 10;
    private final Employee[] employees = new Employee[sizeBook];

    public void addEmployee(Employee employee) {
        int index = -1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                index = i;
                break;
            }
        }
        if (index < 0) {
            System.out.println("Справочник уже заполнен");
            return;
        }
        employees[index] = employee;
        System.out.println("Добавлен сотрудник - " + employee.getFullName());
    }

    public void printEmployee() {
        System.out.println("Данные по всем сотрудникам " + Arrays.toString(employees));
    }

    public int findSumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary(); //
        }
        return sum;
    }

    //поиск сотрудника с минимальной зарплатой
    public Employee findMinSalary() {
        int minSalary = employees[0].getSalary();
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
    public Employee findMaxSalary() {
        int maxSalary = employees[0].getSalary();
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
    public int findAverageSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary(); //
        }
        return sum / employees.length;
    }

    //ФИО всех сотрудников
    public void printFullNameEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    //Проиндексировать зарплату
    public void printIndexSalary(double index) {
        for (Employee employee : employees) {
            employee.setSalary((int) (employee.getSalary() * index));
        }
        System.out.println("Индексация зарплаты " + Arrays.toString(employees));
    }

    //Сотрудник отдела с минимальной зарплатой
    public Employee findEmployeeDepartmentMinSalary(int department) {
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
    public Employee findEmployeeDepartmentMaxSalary(int department) {
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
    public int findSumSalaryOfDepartment(int department) {
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
    public int findAverageSalaryOfDepartment(int department) {
        int sum = 0;
        int countEmployeeOfDepartment = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
                continue;
            }
            sum += employee.getSalary();
            if (employee.getDepartment() == department) {
                countEmployeeOfDepartment++;
            }
        }
        return sum / countEmployeeOfDepartment;
    }

    //Проиндексировать зарплату сотрудников отдела
    public void printIndexSalaryEmployeeOfDepartment(int department, double index) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                employee.setSalary((int) (employee.getSalary() * index));
                System.out.println("Индексация зарплаты по отделу " + employee);
            }
        }
    }

    //Напечатать всех сотрудников отдела
    public void printEmployeeOfDepartment(int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println("Сотрудники по отделу " + "ФИО: " + employee.getFullName() + " Зарплата: " + employee.getSalary() + " id: " + employee.getId());
            }
        }
    }

    //Все сотрудники с зарплатой меньше или больше(равно) заданного числа
    public void printSomeEmployee(int number) {
        for (Employee employee : employees) {
            if (employee.getSalary() < number) {
                System.out.println("Зарплата меньше заданной " + " id: " + employee.getId() + " ФИО: " + employee.getFullName() + " Зарплата: " + employee.getSalary());
            }
            if (employee.getSalary() >= number) {
                System.out.println("Зарплата больше заданной " + " id: " + employee.getId() + " ФИО: " + employee.getFullName() + " Зарплата: " + employee.getSalary());
            }
        }
    }

    //Удалить сотрудника
    public void deleteEmployee(int id) {
        boolean check = true;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {             //Тут ошибка зачем-то вылетает, не понимаю
                employees[i] = null;
                check = false;
            }
            if (check) {
                System.out.println("Данный сотрудник был удален"); //Тут
            }
        }

    }


    /*Изменить сотрудника - НЕ МОГУ ПОНЯТЬ КАК НАПИСАТЬ КОД ПРАВИЛЬНО, ТЕОРЕТИЧЕСКИ ПРОВЕРИТЬ ЕСЛИ id равен тому, что
    задан аргументом в методе, то использовать setSalary, но я не понимаю у кого этот setSalary вызвать. По отделу
    то же самое я так понимаю?

    public void changeSalary(int id) {
        if (Employee.) {

        }
    }

    public void changeDepartment(int id) {
        if (employeeBook.) {
        }
    }

    //Получить Ф. И. О. всех сотрудников по отделам (напечатать список отделов и их сотрудников).
    public void changeDepartment(int id) {
        if (employeeBook.) {
        }
    }               */
}