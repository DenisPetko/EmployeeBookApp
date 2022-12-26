public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 1, 17000 );
        employees[1] = new Employee("Борисов Борис Борисович", 1, 16000 );
        employees[2] = new Employee("Денисов Денис Денисович", 2, 17000 );
        employees[3] = new Employee("Адамович Татьяна Владимировна", 2, 18000 );
        employees[4] = new Employee("Алешин Сергей Сергеевич", 3, 19000 );
        employees[5] = new Employee("Андреева Регина Эгартовна", 3, 200000 );
        employees[6] = new Employee("Астафьева Ирина Николаевна", 4, 11000 );
        employees[7] = new Employee("Базыкин Георгий Александрович", 4, 150000 );
        employees[8] = new Employee("Бастаков Владимир Антонинович", 5, 155000 );
        employees[9] = new Employee("Белецкая Наталия Владимировна", 5, 156000 );

        //Базовая
        Employee.printEmployee(employees);
        System.out.println("Сумма затрат на зарплаты в месяц " + Employee.findSumSalary(employees));
        System.out.println("Сотрудник с минимальной зарплатой " + Employee.findMinSalary(employees));
        System.out.println("Сотрудник с максимальной зарплатой " + Employee.findMaxSalary(employees));
        System.out.println("Средняя зарплата " + Employee.findAverageSalary(employees));

        //Повышенная
        Employee.printIndexSalary(employees, 1.083); //Индексация зарплаты
        System.out.println("Список всех сотрудников:");
        Employee.printFullNameEmployees(employees);
        System.out.println("Сотрудник отдела с минимальной зарплатой " + Employee.findEmployeeDepartmentMinSalary(employees, 4));
        System.out.println("Сотрудник отдела с максимальной зарплатой " + Employee.findEmployeeDepartmentMaxSalary(employees, 4));
        System.out.println("Сумма затрат на зарплату по отделу " + Employee.findSumSalaryOfDepartment(employees, 3));
        System.out.println("Средняя зарплата по отделу " + Employee.findAverageSalaryOfDepartment(employees, 2));
        Employee.printIndexSalaryEmployeeOfDepartment(employees, 1, 1.083);
        Employee.printEmployeeOfDepartment(employees, 1);
        Employee.printSomeEmployee(employees, 100000);
    }

}