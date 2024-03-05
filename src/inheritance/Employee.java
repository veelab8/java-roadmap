package inheritance;

public class Employee extends Worker {
    private long employeeId;
    private String hireDate;
    private static int employeeNo = 1;


    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate); // has to be the first statement
        this.employeeId = Employee.employeeNo++;    // use class with static field
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} \n" + super.toString();
    }
}
