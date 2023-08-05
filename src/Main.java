public class Main {

    private final static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Ivanov Ivan", 1, 50000);
        employees[1] = new Employee("Sergey Sergeev", 2, 55006);
        employees[2] = new Employee("Ivanov Ivanovskiy", 3, 56003);
        employees[3] = new Employee("Sergey Sergeev", 1, 51000);
        employees[4] = new Employee("Ilya Sergeev", 3, 66000);
        employees[5] = new Employee("Alexandr Ivanov", 1, 78000);
        employees[6] = new Employee("Vladimir Ivanov", 3, 7777);
        employees[7] = new Employee("Ivan Dmitrov", 2, 60000);
        employees[8] = new Employee("Dmitry Sergeev", 5, 59000);
        employees[9] = new Employee("Ivan Sergeev", 4, 58000);

        printAllEmployees();
        printSum();
        printEmployeeWithMinSalary();
        printEmployeeWithMaxSalary();
        printAvg();
        printAllNames();
    }

    private static void printAllEmployees() {
        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }

    private static void printSum() {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        System.out.println("Сумма всех зарплат: " + sum);
    }

    private static void printEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + employeeWithMinSalary);
    }

    private static void printEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + employeeWithMaxSalary);
    }

    private static void printAvg() {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        double avgSalary = sum / employees.length;
        System.out.println("Средняя зарплата: " + avgSalary);
    }

    private static void printAllNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}
