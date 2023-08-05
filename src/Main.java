public class Main {
    private static Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        employees[0] = new Employee("Ivanov Ivan", 1, 50000);

        printAllEmployees();
    }
    public static void printAllEmployees() {
        for (Employee employee: employees);
        System.out.println(employee);
    }
}