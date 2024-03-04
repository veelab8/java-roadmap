package srp;

public class MainClient {
    public static void main(String[] args) {
        Employee robin = new Employee("Robin", "Smith", 7.5);
        showEmpDetail(robin);

        System.out.println("\n**********\n");

        Employee kevin = new Employee("Kevin", "Proctor", 3.2);
        showEmpDetail(kevin);
    }

    public static void showEmpDetail(Employee emp) {
        emp.displayEmpDetail();

        EmployeeIdGenerator idGenerator = new EmployeeIdGenerator();
        String empId = idGenerator.generateEmpId(emp.firstName);
        System.out.println("The employee id: " + empId);

        SeniorityChecker seniorityChecker = new SeniorityChecker();
        System.out.println("This employee is a " + seniorityChecker.checkSeniority(emp.experienceInYears) + " employee.");
    }
}
