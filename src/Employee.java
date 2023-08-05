public class Employee {
    private String fullName;
    private int dept;
    private double salary;
    private long id;
    private static long idCounter = 0;

    public String getFullName() {
        return fullName;
    }

    public int getDept() {
        return dept;
    }

    public double getSalary() {
        return salary;
    }

    public long getId() {
        return id;
    }

    public void setDept() {
        this.dept = dept;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String fullName, int dept, int salary) {
        this.fullName = fullName;
        this.dept = dept;
        this.salary = salary;
        this.id = idCounter;
        idCounter++;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", dept=" + dept +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}
