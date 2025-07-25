package LIST;

public class TestEmployee {

	public static void main(String[] args) {
		        EmployeeDB db = new EmployeeDB();
 
		        // Create Employee objects
		        Employee1 emp1 = new Employee1(101, "NADEEM", "nadee@company.com", "Male", 50000f);
		        Employee1 emp2 = new Employee1(102, "JANIFA", "jani@company.com", "Female", 60000f);
		        Employee1 emp3 = new Employee1(103, "sona", "sona@company.com", "Female", 55000f);

		        db.addEmployee(emp1);
		        db.addEmployee(emp2);
		        db.addEmployee(emp3);

		        System.out.println("== Employee Details ==");
		        emp1.GetEmployeeDetails();
		        System.out.println();
		        emp2.GetEmployeeDetails();
		        System.out.println();
		        emp3.GetEmployeeDetails();

		        System.out.println("\n== Payslips ==");
		        System.out.println(db.showPaySlip(101));
		        System.out.println(db.showPaySlip(102));
		        System.out.println(db.showPaySlip(999)); // invalid ID
		        // Delete employee
		        System.out.println("\n== Deleting Employee ID 102 ==");
		        if (db.deleteEmployee(102)) {
		            System.out.println("Employee with ID 102 deleted successfully.");
		        } else {
		            System.out.println("Employee not found.");
		        }

		        System.out.println(db.showPaySlip(102));
		    }
		}