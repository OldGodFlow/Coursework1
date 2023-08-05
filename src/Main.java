public class Main {
    private final static Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        employees[0] = new Employee("Ivanov Ivan", 1, 50000);
        employees[1] = new Employee("Sergey Sergeev", 2, 55000);
        employees[2] = new Employee("Ivanov Ivanovskiy", 3, 56000);
        employees[3] = new Employee("Sergey Sergeev", 1, 51000);
        employees[4] = new Employee("Ilya Sergeev", 3, 66000);
        employees[5] = new Employee("Alexandr Ivanov", 1, 78000);
        employees[6] = new Employee("Vladimir Ivanov", 3, 61000);
        employees[7] = new Employee("Ivan Dmitrov", 2, 60000);
        employees[8] = new Employee("Dmitry Sergeev", 5, 59000);
        employees[9] = new Employee("Ivan Sergeev", 4, 58000);

        printAllEmployees();
    }
    private static void printAllEmployees() {
        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }
}