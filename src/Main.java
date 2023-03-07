import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 1, 15000);
        employees[1] = new Employee("Борисов Борис Борисович", 1, 16000);
        employees[2] = new Employee("Денисов Денис Денисович", 2, 17000);
        employees[3] = new Employee("Адамович Татьяна Владимировна", 2, 18000);
        employees[4] = new Employee("Алешин Сергей Сергеевич", 3, 19000);
        employees[5] = new Employee("Андреева Регина Эгартовна", 3, 12000);
        employees[6] = new Employee("Астафьева Ирина Николаевна", 4, 11000);
        employees[7] = new Employee("Базыкин Георгий Александрович", 4, 150000);
        employees[8] = new Employee("Бастаков Владимир Антонинович", 5, 155000);
        employees[9] = new Employee("Белецкая Наталия Владимировна", 5, 156000);


        Arrays.stream(employees).forEach(System.out::println);
//        Employee.findSumSalary(employees);
        System.out.println("Сумма зарплат: " + Arrays.stream(employees).mapToInt(Employee::getSalary).sum());

//        Employee.indexOn(employees, 1.083);
        double indexOn = 1.083;
        Arrays.stream(employees).map(e -> e.getSalary()*indexOn).forEach(System.out::println);
    }

}