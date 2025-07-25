package LIST;
import java.util.ArrayList;
public class EmployeeDB {
		// TODO Auto-generated method stub
		    ArrayList<Employee1> list = new ArrayList<>();

		    public boolean addEmployee(Employee1 e) {
		        return list.add(e);
		    }

		    public boolean deleteEmployee(int empId) {
		        for (Employee1 e : list) {
		            if (e.empId == empId) {
		                list.remove(e);
		                return true;
		            }
		        }
		        return false;
		    }

		    public String showPaySlip(int empId) {
		        for (Employee1 e : list) {
		            if (e.empId == empId) {
		                return "Payslip for employee ID " + empId + ": ₹" + e.salary;
		            }
		        }
		        return "Employee not found.";
		    }
		}