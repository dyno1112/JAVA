public class EMPLOYEE
{
    private int empId;
    private String empName;
    private String empDesignation;
    private double empSalary;

    public EMPLOYEE(int empId, String empName, String empDesignation, double empSalary) 
    {
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.empSalary = empSalary;
    }

    @Override
    public String toString() 
    {
        return "Employee ID: " + empId + "\n" +
               "Employee Name: " + empName + "\n" +
               "Employee Designation: " + empDesignation + "\n" +
               "Employee Salary: " + empSalary;
    }

    public static void main(String[] args) 
    {      
        EMPLOYEE employee = new EMPLOYEE(1, "John Doe", "Manager", 50000.0);
        System.out.println(employee);
    }
}