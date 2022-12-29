public class Main {

    public static void main(String[] args) {

        /*Employee[] employees = new Employee[10];
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
        */

        /*Базовая
        Employee.printEmployee();
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
        */

        //Очень сложно
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee(new Employee("Иванов Иван Иванович", 1, 17000));
        employeeBook.addEmployee(new Employee("Борисов Борис Борисович", 1, 16000));
        employeeBook.addEmployee(new Employee("Денисов Денис Денисович", 5, 17000));
        employeeBook.addEmployee(new Employee("Адамович Татьяна Владимировна", 2, 18000));
        employeeBook.addEmployee(new Employee("Алешин Сергей Сергеевич", 3, 19000));
        employeeBook.addEmployee(new Employee("Андреева Регина Эгартовна", 3, 200000));
        employeeBook.addEmployee(new Employee("Астафьева Ирина Николаевна", 4, 11000));
        employeeBook.addEmployee(new Employee("Базыкин Георгий Александрович", 3, 150000));
        employeeBook.addEmployee(new Employee("Бастаков Владимир Антонинович", 5, 155000));
        employeeBook.addEmployee(new Employee("Белецкая Наталия Владимировна", 5, 156000));
        //employeeBook.printEmployee();
        System.out.println("Сумма затрат на зарплаты в месяц " + employeeBook.findSumSalary());
        System.out.println("Сотрудник с минимальной зарплатой " + employeeBook.findMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой " + employeeBook.findMaxSalary());
        System.out.println("Средняя зарплата " + employeeBook.findAverageSalary());
        System.out.println("ФИО всех сотрудников:");
        employeeBook.printFullNameEmployees();
        employeeBook.printIndexSalary(1.083);
        System.out.println("Сотрудник отдела с минимальной зарплатой " + employeeBook.findEmployeeDepartmentMinSalary(1));
        System.out.println("Сотрудник отдела с максимальной зарплатой " + employeeBook.findEmployeeDepartmentMaxSalary(1));
        System.out.println("Сумма затрат на зарплату по отделу " + employeeBook.findSumSalaryOfDepartment(1));
        System.out.println("Средняя зарплата по отделу " + employeeBook.findAverageSalaryOfDepartment(1));
        employeeBook.printIndexSalaryEmployeeOfDepartment(1, 1.083);
        employeeBook.printEmployeeOfDepartment(2);
        employeeBook.printSomeEmployee(100000);
        employeeBook.deleteEmployee(4);
        //проверил удаляется ли сотрудник
        employeeBook.changeEmployee("Иванов Иван Иванович", 100, 5);
        //проверил меняется ли сотрудник
        employeeBook.printAllEmployeeOfDepartment();




    }

}