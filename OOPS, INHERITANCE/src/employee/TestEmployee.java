package employee;

public class TestEmployee {
	    public static void main(String[] args) {
	        // Create Employee object
	        Employee emp = new Employee("JANIFA", 80000.0, 2022, "NI9490054");

	        // Print details
	        System.out.println("Name: " + emp.getName());
	        System.out.println("Annual Salary: " + emp.getAnnualSalary());
	        System.out.println("Year Started: " + emp.getYearStarted());
	        System.out.println("National Insurance Number: " + emp.getNationalInsuranceNumber());

	        // Update details
	        emp.setName("NADEEM");
	        emp.setAnnualSalary(80000.0);
	        emp.setYearStarted(2017);
	        emp.setNationalInsuranceNumber("NI7702078");

	        // Print updated details
	        System.out.println("\nUpdated Employee Details:");
	        System.out.println("Name: " + emp.getName());
	        System.out.println("Annual Salary: " + emp.getAnnualSalary());
	        System.out.println("Year Started: " + emp.getYearStarted());
	        System.out.println("National Insurance Number: " + emp.getNationalInsuranceNumber());
	    }
	}